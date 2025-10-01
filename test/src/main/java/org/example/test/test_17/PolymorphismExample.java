package org.example.test.test_17;

class Animal {
    public void makeSound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("멍멍!");
    }

    public void fetch() {
        System.out.println("공을 가져옵니다.");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("야옹~");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();
        for (Animal animal : animals) {
            animal.makeSound();
            if (animal instanceof Dog) {
                ((Dog) animal).fetch();
            }
        }
    }
}

/*
동물(`Animal`) 클래스와 이를 상속받는 개(`Dog`), 고양이(`Cat`)클래스를 통해 다형성을 구현합니다.
업캐스팅된 객체를 다루고, 필요한 경우 다운캐스딩하여 자식 클래스 고유의 메서드를 호출

요구사항 명세서
1. makeSound() 메서드를 가진 Animal 클래스를 만듭니다.
2. Animal을 상속하고 makeSound()를 오버라이딩하는 Dog와 Cat 클래스를 만듭니다.
3. Dog 클래스에는 고유 메서드인 fetch()를 추가합니다.
4. Animal 타입의 배열 animals에 Dog와 Cat 객체를 업캐스팅하여 저장합니다.
5. 반복문을 통해 배열의 모든 동물이 각자의 소리를 내도록 makeSound()를 호출
6. instanceof 연산자로 Dog 객체를 확인한 후, 다운캐스팅 하여 fetch() 메서드를 호출
 */