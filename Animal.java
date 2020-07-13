package animals;


public abstract class Animal {
    private String name;
    private int age;
    private String gender;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Animal(String name, int age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    private void setAge(int age) {
        if (age <= 0){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    private void setGender(String gender) {
        if(!(gender.equals("Male") || gender.equals("Female"))){
            throw new IllegalArgumentException("Invalid input!");
        }

        this.gender = gender;
    }



    private void setName(String name) {
        if ( name.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }
    public abstract String produceSound();

    @Override
    public String toString() {
        return String.format("%s%n%s %d %s%n%s",this.getClass().getSimpleName(),
                this.getName(),this.getAge(),this.gender,this.produceSound());

    }
    protected static Animal createAnimal( String typeOfAnimal, String[] data, String name, int age) {
        switch (typeOfAnimal) {

            case "Dog":
                return new Dog(name, age, data[2]);



            case "Cat":

                return new Cat(name, age, data[2]);


            case "Frog":

                return new Frog(name, age,data[2]);


            case "Kitten":
                return new Kitten(name, age);

            case "Tomcat":
                return new Tomcat(name, age);

            default:
                throw new IllegalArgumentException("Invalid input!");
        }

}


    }
