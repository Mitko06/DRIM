package com.company;
import java.io.BufferedReader;
import java.util.*;

class RamkiNiza<E>{
    private E[] nizaOdRamki;
    private int brojNaRamki;
    private Ramka[] ramki;
    private static double dolzhinaProfil=600.0;
    private Packet[] paketi;
    private E[] nizaSimi;
    private ArrayList<Double> nizaVrednosti;

    RamkiNiza(int size){
        nizaOdRamki=(E[])new Object[size];
        this.brojNaRamki=size;
        paketi=new Packet[brojNaRamki*4];
        ramki=new Ramka[size];
        nizaVrednosti = new ArrayList<Double>(2^(brojNaRamki*4));
    }

    public void setPacketi(){
        setRamki();
        int tmpI=0;
        int n=brojNaRamki*4;
        for (int i=0;i<n;i+=4){

             paketi[i]=new Packet("Shirina Gore("+ramki[tmpI].getId()+")",ramki[tmpI].shirina);
             paketi[i+1]=new Packet("Shirina Dolu("+ramki[tmpI].getId()+")",ramki[tmpI].shirina);
             paketi[i+2]=new Packet("Visina Levo("+ramki[tmpI].getId()+")",ramki[tmpI].visina);
             paketi[i+3]=new Packet("Visina Desno("+ramki[tmpI].getId()+")",ramki[tmpI].visina);
             tmpI++;
        }
    }

    public void presmetajKombinacii(){
        int n=paketi.length;
        int goleminaPodniza=1;
        for (int i=0;i<n;i++){
            for (int j=0;j<n-1;j++){

            }
        }
    }

    public void setListaVrednosti(){

    }
    public void setRamki(){
        for (int i=0;i<brojNaRamki;i++){
            ramki[i]=(Ramka) nizaOdRamki[i];
        }
    }

    public void dodadiRamka(E o,int pozicija){
        if (pozicija>=0 && pozicija<=brojNaRamki){
            nizaOdRamki[pozicija]=o;
        }

    }
    public void display() {
        for (int i = 0; i < brojNaRamki; i++) {
            System.out.println(nizaOdRamki[i]);
        }
    }
}

class Packet{
    //public double shirinaA;
    //public double shirinaB;
    //public double visinaA;
    public double vrednost;
    public String id;

    Packet(String id,double vrednost){
        this.id=id;
        this.vrednost=vrednost;
        //this.shirinaB=shirina;
        //this.visinaA=visina;
        //this.visinaB=visina;

    }
}

class Ramka{
    protected double shirina;
    protected double visina;
    private static double firaOdNozh=0.4;
    private String id;


    Ramka(String id,double shirina,double visina){
        this.shirina=shirina;
        this.visina=visina;
        this.id=id;

    }
    public double getRamkaDimenzii(){
        return shirina+visina;
    }
    @Override
    public String toString(){
        return "#"+id+" Dolzhina na Strana: "+(shirina)+"\n"+"Visina na Strana: "+(visina)+"\n"+"------------------------------------ \n";
    }
    public double getShirina(){
        return shirina;
    }
    public double getVisina(){
        return visina;
    }
    public String getId(){
        return id;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);
        int vlez=br.nextInt();
        RamkiNiza<Object> niza=new RamkiNiza<>(vlez);
        Ramka ramka;
        String id="fixedId";
        /*for (int i=0;i<vlez;i++){
            System.out.println("Vnesi Shirina:");
            double shirina=br.nextDouble();
            System.out.println("Vnesi Visina:");
            double visina=br.nextDouble();
            System.out.println("-------------------------------------");
            ramka=new Ramka(id,shirina,visina);
            niza.dodadiRamka(ramka,i);
        }
        niza.display();
        niza.setPacketi();*/
    }
}
