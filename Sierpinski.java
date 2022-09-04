public class Sierpinski {
    public static void makeTriangles(int depthLeft, double x, double y, double base) { //assume base=height; x y coords for bottom base
        // StdDraw.pause(100); //get rid of this for speed
        StdDraw.filledPolygon(new double[] {x, x-base/2, x+base/2}, new double[] {y, y+base, y+base});
        if(depthLeft<=0) return; //base case
        makeTriangles(depthLeft-1, x, y+base, base/2); //upper Tri
        makeTriangles(depthLeft-1, x-base/2, y, base/2); //left Tri
        makeTriangles(depthLeft-1, x+base/2, y, base/2); //right Tri
    }
    public static void main(String[] args) {
        StdDraw.setXscale(-1, 1);
        StdDraw.setYscale(0, 2);

        StdDraw.polygon(new double[] {-1, 1, 0}, new double[] {0, 0, 2});
        
        makeTriangles(10, 0, 0, 1);
    }
}