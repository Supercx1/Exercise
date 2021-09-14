package com.house.sys.view;

import com.house.sys.domain.House;
import com.house.sys.service.HouseService;

import java.util.Scanner;

public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    private HouseService houseService  = new HouseService(2);
    Scanner myScanner = new Scanner(System.in);
    public void update(){
        System.out.println("======修改房屋信息======");
        System.out.println("请输入修改房屋id(-1:退出）：");
        int updateid = myScanner.nextInt();
        if(updateid == -1){
            System.out.println("你放弃了修改信息");
            return;
        }
        House houses = houseService.findById(updateid);
        if(houses == null){
            System.out.println("你输入的房屋信息不存在");
            return;
        }
        System.out.println("房主：("+houses.getName()+"):");
        String name = myScanner.next();
        houses.setName(name);
        System.out.println("电话：("+houses.getPhone()+"):");
        String phone = myScanner.next();
        houses.setPhone(phone);
        System.out.println("地址：("+houses.getAddress()+"):");
        String address = myScanner.next();
        houses.setAddress(address);
        System.out.println("租金：("+houses.getRent()+"):");
        int rent = myScanner.nextInt();
        houses.setRent(rent);
        System.out.println("状态：("+houses.getState()+"):");
        String state = myScanner.next();
        houses.setState(state);
        System.out.println("修改成功！");
    }
    public void findHouse(){
        System.out.println("=====查找房屋信息=====");
        System.out.println("请输入你要查找房屋的ID");
        int findId = myScanner.nextInt();
        House houses=houseService.findById(findId);
        if(houses!=null){
            System.out.println(houses);
        }else{
            System.out.println("查找房屋id不存在");
        }
    }
    public void exit(){
        System.out.println("你确定要退出吗？y/n");
        char choice = myScanner.next().charAt(0);
        if(choice=='y'){
            loop = false;
        }else{
            System.out.println("你放弃了退出");
        }
    }
    public void delHouse(){
        System.out.println("======删除房屋信息======");
        System.out.println("请输入待删除房屋编号（-1：退出）：");
        int delId = myScanner.nextInt();
        if(delId==-1){
            System.out.println("=======放弃删除房屋信息=====");
            return;
        }
        System.out.println("你确定要删除？y/n");
        char choice = myScanner.next().charAt(0);
        if(choice == 'y'){
            if (houseService.del(delId)) {
                System.out.println("删除房屋信息成功");
            }else {
                System.out.println("房屋编号不存在");
            }
        }else{
            System.out.println("=======放弃删除房屋信息====");
        }


    }
    public void addHouse(){
        System.out.println("姓名：");
        String name = myScanner.next();
        System.out.println("电话：");
        String phone = myScanner.next();
        System.out.println("地址：");
        String address = myScanner.next();
        System.out.println("月租：");
        int rent = myScanner.nextInt();
        System.out.println("状态：");
        String state = myScanner.next();
        House newhouse = new House(0, name, phone, address, rent, state);
        if(houseService.add(newhouse)){
            System.out.println(" ========添加房屋成功======");
        }else {
            System.out.println("======添加房屋失败========");
        }
    }
    public void listHouse(){
        System.out.println("========房屋列表=========");
        System.out.println("编号\t房主\t电话\t地址\t月租\t状态（未出租/已出祖）");
        House[] houses = houseService.list();
        for(int i = 0; i< houses.length; i++){
            if(houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("=======房屋列表显示完毕======");
    }
    public void mainMenu(){
        do{
            System.out.println("========房屋出租系统=========");
            System.out.println("\t\t1 新增房源");
            System.out.println("\t\t2 查找房屋");
            System.out.println("\t\t3 删除房屋信息");
            System.out.println("\t\t4 修改房屋信息");
            System.out.println("\t\t5 房屋列表");
            System.out.println("\t\t6 退  出");
            System.out.println("请输入你的选择1-6");
            key= myScanner.next().charAt(0);
            switch(key){
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    update();
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    exit();
                    break;

            }


        }while (loop);



    }
}
