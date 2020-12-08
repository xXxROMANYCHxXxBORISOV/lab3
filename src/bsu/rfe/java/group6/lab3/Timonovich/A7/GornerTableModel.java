package bsu.rfe.java.group6.lab3.Timonovich.A7;

import javax.swing.table.AbstractTableModel;
public class GornerTableModel extends AbstractTableModel {
    private Double[] coefficients;
    private Double from;
    private Double to;
    private Double step;
    public GornerTableModel(Double from, Double to, Double step, Double[]
            coefficients) {
        this.from = from;
        this.to = to;
        this.step = step;
        this.coefficients = coefficients;
    }
    public Double getFrom() {
        return from;
    }
    public Double getTo() {
        return to;
    }
    public Double getStep() {
        return step;
    }
    @Override
    public int getColumnCount() {
// TODO Auto-generated method stub
        return 0;
    }
    @Override
    public int getRowCount() {
// TODO Auto-generated method stub
        return 0;
    }
    @Override
    public Object getValueAt(int arg0, int arg1) {
// TODO Auto-generated method stub
        return null;
    }
    @Override
    public Class<?> getColumnClass(int arg0) {
// TODO Auto-generated method stub
        return super.getColumnClass(arg0);
    }
    @Override
    public String getColumnName(int arg0) {
// TODO Auto-generated method stub
        return super.getColumnName(arg0);
    }
}

