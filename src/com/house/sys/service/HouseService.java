package com.house.sys.service;

import com.house.sys.domain.House;

public class HouseService {
    private House[] houses;
    private int houseNums=1;
    private int idcounter=1;
    public HouseService(int size){
        houses=new House[size];
        houses[0]=new House(1,"tom","1234","成都",1000,"未出租");
    }
    public House findById(int findId){
        for (int i = 0; i < houseNums; i++) {
            if(findId==houses[i].getId()){
                return houses[i];
            }
        }
        return  null;
    }
    public boolean del(int delId){
        int indext = -1;
        for (int i = 0; i < houseNums; i++) {
            if(delId == houses[i].getId()){
                indext = i;
            }


        }
        if(indext == -1){
            return false;
        }
        for(int i=indext;i<houseNums-1;i++){
            houses[i]=houses[i+1];
        }
        houses[--houseNums]=null;
        return true;

    }
    public boolean add(House newhouse){
        if(houseNums==houses.length){
            System.out.println("数组已满，不能添加了");
            return false;
        }
        houses[houseNums++]=newhouse;
        newhouse.setId(++idcounter);
        return true;

    }
    public House[] list(){
        return houses;
    }
}
