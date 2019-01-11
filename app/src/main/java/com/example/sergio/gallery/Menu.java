package com.example.sergio.gallery;

import java.util.ArrayList;

public class Menu {
    private int idImage;
    private String nameImage;

    public Menu(int idImage, String nameImage) {
        this.idImage = idImage;
        this.nameImage = nameImage;
    }

    public Menu() {
        this.idImage = 0;
        this.nameImage = "";
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public String getNameImage() {
        return nameImage;
    }

    public void setNameImage(String nameImage) {
        this.nameImage = nameImage;
    }

    public ArrayList<Menu> listMenu(){
        Menu menu;

        ArrayList<Menu> lista = new ArrayList<Menu>();

        Integer[] idList = new Integer[]{R.drawable.ima1,R.drawable.ima2,R.drawable.ima3,R.drawable.ima4,R.drawable.ima5,R.drawable.ima6,R.drawable.ima7};
        String[] nameList = new String[]{"ima1","ima2","ima3","ima4","ima5","ima6","ima7"};

        for (int i=0; i<idList.length; i++){
            menu = new Menu(idList[i],nameList[i]);
            lista.add(menu);
        }
        return  lista;
    }
}
