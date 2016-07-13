package com.hattapong.zoo;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Hattapong on 7/13/2016.
 */
public class Zoo {
    private List<Zone> zone;
    private Employee e1,e2,e3;
    RandomAnimal randAnimal1,randAnimal2,randAnimal3;

    public Zoo(){
        zone = new ArrayList<>();
        generateZone();
    }

    protected void showAnimal(){
        System.out.println("    รายชื่อสัตว์ในแต่ละโซน");
        System.out.println("--------------------------------------------------------------------------------");
        zone.get(0).showAnimalList();
        System.out.println("--------------------------------------------------------------------------------");
        zone.get(1).showAnimalList();
        System.out.println("--------------------------------------------------------------------------------");
        zone.get(2).showAnimalList();
        System.out.println("--------------------------------------------------------------------------------");
    }

    protected void showDetail(){
        System.out.println("    รายละเอียดของสวนสัตว์");
        System.out.println("    สวนสัตว์นี้เปิดมาเป็นเวลา 1,000 ปี มีสัตว์มากมายน้อยชนิด ซึ่งสวนสัตว์เรานี้ ภูมิใจนำเสนอ");
        System.out.println("    มีจุดประสงค์เพื่อให้นักเรียน นักศึกษา พ่อแม่ ผู้ปกครอง ได้ชมสัตว์ต่างๆ หลายชนิดในสวนสัตว์เปิดแห่งนี้");
        System.out.println("    โดยสวนสัตว์ของเราได้แบ่งออกเป็น 3 โซน คือ โซนสัตว์กินพืช โซนสัตว์กินเนื้อ โซนสัตว์กินทั้งพืชและสัตว์");
        System.out.println("    ที่อยู่: 235 ม.7 ต.บางพระ อ.ศรีราชา จ.ชลบุรี 20110");
        System.out.println("    โทร: 0-3831-8444");
        System.out.println("    แฟกซ์: 0-3831-8400");
        System.out.println("    E-mail: admin@kkopenzoo.com");
    }

    protected void showZoneDetail(){
        System.out.println("    ข้อมูลในแต่ละโซน");
        System.out.println("--------------------------------------------------------------------------------");
        zone.get(0).showDetail();
        System.out.println("--------------------------------------------------------------------------------");
        zone.get(1).showDetail();
        System.out.println("--------------------------------------------------------------------------------");
        zone.get(2).showDetail();
        System.out.println("--------------------------------------------------------------------------------");

    }

    private void generateZone() {
        e1 = new Employee("Wilailux","Lomwongpaiboon");
        e2 = new Employee("Nutdanai","Prompuiy");
        e3 = new Employee("Hattapong","Mankong");

        randAnimal1 = new RandomAnimal(FoodType.OMNIVORE,e1);
        randAnimal2 = new RandomAnimal(FoodType.HERBIVORE,e2);
        randAnimal3 = new RandomAnimal(FoodType.CARNIVORE,e3);

        zone.add(new OmniHouse(e1,randAnimal1.getAnimal()));
        zone.add(new HerbiHouse(e2,randAnimal2.getAnimal()));
        zone.add(new CarniHouse(e3,randAnimal3.getAnimal()));
    }


    public static void main(String[] args) {
        Zoo z1 = new Zoo();
        System.out.println("***************************************************************************");
        System.out.println("                          ยินดีต้อนรับสู่ สวนสัตว์");
        System.out.println("***************************************************************************");
        System.out.println("    \"กรุณาเลือกคำสั่งต่อไปนี้\"");
        System.out.println("    กด 1 เพื่อดูรายละเอียดของสวนสัตว์");
        System.out.println("    กด 2 เพื่อดูรายข้อมูลในแต่ละโซน");
        System.out.println("    กด 3 เพื่อดูรายชื่อสัตว์ในแต่ละโซน");
        System.out.println("    กด q เพื่อออกจากระบบ");
        System.out.println("***************************************************************************");
        System.out.printf("    กรุณาเลือกคำสั่ง : ");

        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        if(command.equals("1")){
            z1.showDetail();
        }else if(command.equals("2")){
            z1.showZoneDetail();
        }else if(command.equals("3")){
            z1.showAnimal();
        }
        while(!command.equals("q")){
            System.out.println("***************************************************************************");
            System.out.printf("    กรุณาเลือกคำสั่งอีกครั้ง : ");
            scan = new Scanner(System.in);
            command = scan.nextLine();
            if(command.equals("1")){
                z1.showDetail();
            }else if(command.equals("2")){
                z1.showZoneDetail();
            }else if(command.equals("3")){
                z1.showAnimal();
            }else if(command.equals("q")){
                break;
            }
        }
        System.out.println("***************************************************************************");
        System.out.println("    ออกจากระบบสำเร็จ ขอบคุณครับ");
    }
}
