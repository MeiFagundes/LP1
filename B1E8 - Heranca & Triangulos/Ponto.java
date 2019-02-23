public class Ponto {

    float x, y;

    Ponto(float x, float y){
        this.x = x;
        this.y = y;
    }

    Ponto(){
        this(0, 0);
    }

    // SET
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    // GET
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getDifference(float x, float y){
        if (x > y) {
            return Math.abs(x - y);
        } else if (x < y) {
            return Math.abs(y - x);
        } else {
            return 0;
        }
    }

    public float getDistancia(Ponto p0, Ponto p1){
        float x = getDifference(p0.x, p1.x);
        float y = getDifference(p0.y, p1.y);
        return (float) Math.sqrt((x * x) + (y * y));
    }
}