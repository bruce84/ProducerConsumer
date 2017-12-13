package org.lxy.example.thread.prodconsumer;

import org.lxy.example.thread.prodconsumer.Goods;
import org.lxy.example.thread.prodconsumer.Container;


public class Producer implements Runnable {
	Container con;
	
    public Producer(){
        this(new Container());
    }
    
    public Producer(Container con){
        this.con=con;
    }

    public void run(){
        for(int i=0; i<20; i++){
            Goods good = new Goods(i);
            con.push(good);
            //System.out.println("生产了："+good);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
