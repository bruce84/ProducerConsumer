package org.lxy.example.thread.prodconsumer;

import org.lxy.example.thread.prodconsumer.Goods;

public class Container {
	private int index = 0;  
    Goods[] goods = new Goods[6];

    public synchronized void push(Goods good){
        while(index==goods.length){ //当容器满了，生产者等待
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        goods[index]=good;
        index++;
        
        System.out.println("生产了："+good);
        
        notifyAll(); //当生产者放入商品后通知消费者
    }

    public synchronized Goods pop(){
        while(index==0){ //当容器内没有商品时，消费者等待
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        Goods good = goods[--index];     //LIFO，消费顺序与生产顺序相反
        System.out.println("消费了：" + good);
        
        notifyAll(); //当消费者消费了商品后通知生产者
        return good;
    }
}
