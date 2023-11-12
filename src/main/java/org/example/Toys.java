package org.example;

import java.util.Random;

class Toys{

    private int id;
    private String name;
    private int number;

    public Toys(int[] allId, String name, int number){
        this.id=randomId(allId);
        this.name=name;
        this.number=number;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(){
        number-=1;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void setName(String name){
        this.name = name;
    }

    public int randomId(int[] allId){
        Random random = new Random();
        int newId = random.nextInt(100);
        if(allId != null){
            while(true){
                newId = random.nextInt(100);
                for(int i=0; i<allId.length; i++){
                    if(allId[i] == newId) break;
                }
                return newId;
            }
        }else return newId;
    }

    @Override
    public String toString(){
        return "\nid:"+id+"\nИгрушка:"+name+"\nКолличество:"+number+" шт.\n";
    }
}