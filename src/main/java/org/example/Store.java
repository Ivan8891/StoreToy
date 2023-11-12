package org.example;

import java.util.ArrayList;

class Store{
    private ArrayList<Toys> toys = new ArrayList<Toys>();

    public void creatToy(String name, int number){
        toys.add(new Toys(getAllId(), name, number));
        System.out.println("Игрушка " + name + " добавлена.");
    }

    public void removeToy(int id){
        int index = findIndex(id);
        if(index != -1){
            toys.remove(index);
            System.out.println("Игрушка удалена.");
        }else System.out.println("Ошибка: id не найден.");
    }

    public void editToy(int id){
        int index = findIndex(id);
        if(index != -1){
            toys.get(index).setName(View.inputStr("Введите новое название: "));
            toys.get(index).setNumber(View.inputNum("Введите новое колличество: "));
            System.out.println("Изменения внесены.");
        }else System.out.println("Ошибка: id не найден.");
    }

    public int findIndex(int id){
        int i;
        for(i=0; i<toys.size(); i++){
            if(toys.get(i).getId()==id) return i;
        }
        i = -1;
        return i;
    }

    public void getPrize(int id){
        if(id == -1)System.out.println("Сначало задайте список игрушек.");
        else {
            for(Toys toy : toys){
                if(toy.getId() == id){
                    toy.setNumber();
                    System.out.println("Приз выдан: " + toy.getName());
                }
            }
        }
    }

    public ArrayList<Toys> getArray(){
        return toys;
    }

    public int[] getAllId(){
        if(toys.size() != 0){
            int[] allId = new int[toys.size()];
            for(int i=0; i<toys.size(); i++){
                allId[i] = toys.get(i).getId();
            }
            return allId;
        }else return null;
    }

    public boolean fullStore(){
        boolean cheack = false;
        for(Toys toy : toys){
            if(toy.getNumber() > 0){
                cheack = true;
                break;
            }
        }
        return cheack;
    }
    public boolean fullToys(){
        return !toys.isEmpty();
    }

    public void print(){
        if(fullToys()) System.out.println(toys);
        else System.out.println("Список пуст.");
    }
}