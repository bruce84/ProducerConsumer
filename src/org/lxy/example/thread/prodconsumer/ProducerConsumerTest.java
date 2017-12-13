package org.lxy.example.thread.prodconsumer;

import org.lxy.example.thread.prodconsumer.Container;
import org.lxy.example.thread.prodconsumer.Producer;
import org.lxy.example.thread.prodconsumer.Consumer;


public class ProducerConsumerTest {
	public static void main(String[] args) {
		Container con = new Container();
		Producer p = new Producer(con);
		Consumer c = new Consumer(con);
		new Thread(p).start();
		new Thread(c).start();
	}
}
