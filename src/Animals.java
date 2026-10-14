
public class Animals {
	private String type;
    private String color;
    private int age;
    
    public Animals (String type, String color, int age){
        this.type = type;
        this.color = color;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
    
    public boolean isYoung(){
        if(getType().equals("cat") && getAge() < 10)
            return true;
        else if(getType().equals("bird") && getAge() < 3)
            return true;
        return false;
    }

}
