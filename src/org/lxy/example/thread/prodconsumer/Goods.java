package org.lxy.example.thread.prodconsumer;

public class Goods {
    int id;
    public Goods(int id){
        this.id=id;
    }

    public String toString(){
        return "商品"+this.id;
    }

}
