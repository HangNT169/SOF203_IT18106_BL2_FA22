/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B1_2_OverviewJavaCore;

/**
 *
 * @author hangnt
 */
public class Con extends Cha {

    private int tuoi;

    public Con() {
    }

    public Con(int tuoi, String name) {
        super(name);
        this.tuoi = tuoi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public void display(){
        System.out.println("Con");
    }
}
