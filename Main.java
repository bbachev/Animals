package animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        List<Animal> animals = new ArrayList<>();

        while (!line.equals("Beast!")) {
           try{ String typeOfAnimal = line;
            String[] data = scanner.nextLine().split("\\s+");
            String name = data[0];
            int age = Integer.parseInt(data[1]);


            Animal animal = Animal.createAnimal(typeOfAnimal, data, name, age);
            animals.add(animal);
           } catch (IllegalArgumentException ex) {

                System.out.println(ex.getMessage());
            }
            line = scanner.nextLine();
        }
        for (Animal animal : animals) {
            System.out.println(animal.toString().trim());
        }




          }


    }




