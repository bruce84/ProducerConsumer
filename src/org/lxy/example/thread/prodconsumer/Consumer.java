package org.lxy.example.thread.prodconsumer;

import org.lxy.example.thread.prodconsumer.Container;

public class Consumer implements Runnable{
	Container con;
	
	public Consumer() {
		this(new Container());
	}	

	public Consumer(Container con) {
		this.con = con;
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			//Goods good = con.pop();
			con.pop();
			//System.out.println("消费了：" + good);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
