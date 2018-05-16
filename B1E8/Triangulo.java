public class Triangulo extends Ponto {

    float perimetro, area, l1, l2, l3;

    Ponto ponto[] = new Ponto[3];

    Triangulo(Ponto p0, Ponto p1, Ponto p2) {
        ponto[0] = p0;
        ponto[1] = p1;
        ponto[2] = p2;
        setPerimetro();
        setArea();
    }

    Triangulo() {
        Ponto p = new Ponto(0, 0);
        ponto[0] = p;
        ponto[1] = p;
        ponto[2] = p;
        setPerimetro();
        setArea();
    }

    // SET
    public void setPerimetro() {
        this.l1 = getDistancia(ponto[0], ponto[1]);
        this.l2 = getDistancia(ponto[1], ponto[2]);
        this.l3 = getDistancia(ponto[2], ponto[0]);
        this.perimetro = this.l1 + this.l2 + this.l3;
    }

    public void setArea() {
        float sP = this.perimetro / 2;
        this.area = (float) Math.sqrt(sP * (sP - this.l1) * (sP - this.l2) * (sP - this.l3));
    }

    // GET
    public float getArea() {
        return this.area;
    }

    public float getPerimetro() {
        return this.perimetro;
    }
}