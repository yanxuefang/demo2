package com.atguigu.spring5;

public class Orders {
    private String oname;
    private String adress;

    public Orders(String oname, String adress) {
        this.oname = oname;
        this.adress = adress;
    }
    public void ordersTest(){
        System.out.println(oname+"::"+adress);
    }
}
