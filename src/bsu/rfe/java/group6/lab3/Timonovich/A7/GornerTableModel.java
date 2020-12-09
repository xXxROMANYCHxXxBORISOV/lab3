package bsu.rfe.java.group6.lab3.Timonovich.A7;

import javax.swing.table.AbstractTableModel;

public class GornerTableModel extends AbstractTableModel {

    private Double[] coefficients;
    private Double from;
    private Double to;
    private Double step;
    private Boolean even;
    private double result;

    public GornerTableModel(Double from, Double to, Double step, Double[] coefficients) {
        this.from = from;
        this.to = to;
        this.step = step;
        this.coefficients = coefficients;
    }

    public Double getFrom() {
        return from;
    }
    public Double getTo(){
        return to;
    }

    public Double getStep(){
        return step;
    }

    @Override
    public int getColumnCount(){
        return 3;
    }

    @Override
    public int getRowCount(){
        return new Double(Math.ceil((to-from)/step)).intValue()+1;
    }
    @Override
    public Object getValueAt(int row, int col){
        double x = from + step*row;
        switch (col) {
            case 0:
                return x;
            case 1:
            {
                result = 0.0;
                for (int i = 0; i < coefficients.length; i++){
                    result += Math.pow(x, coefficients.length-1-i)*coefficients[i];
                }
                return result;
            }
            default:
            {
                result = 0.0;
                for(int i = 0; i < coefficients.length; i++){
                    result += Math.pow(x,coefficients.length-1-i)*coefficients[i];
                }
                int intResult=(int) result;
                if ((intResult % 2) == 0.0) {return even = true;}
                else return false;
            }
        }
    }
    @Override
    public String getColumnName(int col) {
        switch (col) {
            case 0:
                return "Значение X";
            case 1:
                return "Значение многочлена";
            default:
                return "Значение целой части четное";
        }
    }
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch(columnIndex){
            case 0:
            case 1:
                return Double.class;
            default:
                return Boolean.class;
        }
    }
}



