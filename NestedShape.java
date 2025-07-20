import java.awt.*;
import java.util.ArrayList;
public class NestedShape extends RectangleShape{
    private ArrayList<Shape> innerShapes = new ArrayList<Shape>();
    public NestedShape(){
        super();
        Shape newShape = new RectangleShape(0,0,width/2,height/2,width,height,color,PathType.BOUNCE, text);
        newShape.setParent(this);
        innerShapes.add(newShape);
    }

    public NestedShape(int x,int y,int width,int height,int margin_width,int margin_height, Color fill_colour,PathType path_type,String text){
        super(x, y, width, height, margin_width, margin_height, fill_colour, path_type, text);
        Shape newShape = new RectangleShape(0,0,width/2,height/2,width,height,fill_colour,path_type,text);
        newShape.setParent(this);
        innerShapes.add(newShape);
    }
    public NestedShape(int width, int height){
        super(0,0,width,height,DEFAULT_MARGIN_WIDTH,DEFAULT_MARGIN_HEIGHT, Color.black, PathType.BOUNCE, "");
    }
    public Shape createInnerShape(int x, int y, int w, int h, Color c, PathType pt,String text, ShapeType st){
        Shape newShape;
        switch(st){
            case RECTANGLE:{
                newShape = new RectangleShape(x,y,w,h,width,height,c,pt,text);
                innerShapes.add(newShape);
                innerShapes.get(innerShapes.size()-1).setParent(this);
                break;
            }case OVAL:{
                newShape = new OvalShape(x,y,w,h,width,height,c,pt,text);
                innerShapes.add(newShape);
                innerShapes.get(innerShapes.size()-1).setParent(this);
                break;
            }default:{
                newShape = new NestedShape(x,y,w,h,width,height,c,pt,text);
                innerShapes.add(newShape);
                innerShapes.get(innerShapes.size()-1).setParent(this);
                break;
            }
        }
        return newShape;
    }
    public Shape getInnerShapeAt(int index){
        return innerShapes.get(index);
    }
    public int getSize(){
        return innerShapes.size();
    }
    public int indexOf(Shape s){
        return innerShapes.indexOf(s);
    }
    public void add(Shape s){
        s.setParent(this);
        innerShapes.add(s);
    }
    public void remove(Shape s){
        innerShapes.remove(s);
        s.setParent(null);
    }
    public ArrayList<Shape> getAllInnerShapes(){
        return innerShapes;
    }
    public void setWidth(int w){
        width = w;
        for (Shape nShape: innerShapes){
            nShape.marginWidth=w;
        }
    }
    public void setHeight(int h){
        height = h;
        for (Shape nShape: innerShapes){
            nShape.marginHeight=h;
        }
    }
    public void setColor(Color c){
        color = c;
        for (Shape nShape: innerShapes){
            nShape.color=c;
        }
    }
    public void setText(String t){
        text = t;
        for (Shape nShape: innerShapes){
            nShape.text=t;
        }
    }
    public void draw(Painter painter){
        painter.setPaint(Color.black);
        painter.drawRect(x, y, width, height);
        painter.translate(x, y);
        for (Shape nShape: innerShapes){
            nShape.draw(painter);
        }
        painter.translate(-x, -y);
    }
    public void move(){
        super.move();
        for (Shape nShape: innerShapes){
            nShape.move();
        }
    }

}
