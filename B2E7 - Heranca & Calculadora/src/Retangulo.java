/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Retangulo extends OpAvancado{
    public double area(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        return distancia(x1, y1, x2, y2)*distancia(x1, y1, x3, y3);
    }
    public double area(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        return distancia(x1, y1, x2, y2)*distancia(x1, y1, x3, y3);
    }
}
