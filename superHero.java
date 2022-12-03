public class superHero{

    private int age;
    private String name;
    private String superPower;
    private String weakness;
    
    public superHero(int age, String name, String superPower, String weakness){
       this.age = age;
       this.name = name;
       this.superPower = superPower;
       this.weakness = weakness; 
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSuperPower(String superPower){
        this.superPower = superPower;
    }
    public void setWeakness(String weakness){
        this.weakness = weakness;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getSuperPower(){
        return superPower;
    }
    public String getWeakness(){
        return weakness;
    }

}