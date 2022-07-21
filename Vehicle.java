package Transport;
import java.util.ArrayList ;
import java.util.Arrays;
import java.util.Scanner;

class vehicle {
    final int num;     //번호
    static int fuel=100;      //기름
    static int speed;      //속도
    int speedChange=30;         //속도변경
    int maxPeople=30;          //최대 승객수
    boolean condition=false;      //true면 운행출력,false면 차고지행 출력

    int passenger;

    int restPep=0;
    public vehicle(int num){
        this.num=num;
        this.fuel=fuel;
        this.speed=speed;
        this.speedChange=speedChange;
        this.maxPeople=maxPeople;
        this.condition=condition;
        this.passenger=passenger;

    }

    public void ridePeople(int passenger) {
        if (0 < passenger) {
            restPep+=passenger;
        }
        System.out.println("승객 탑승: " + this.restPep);
    }

    void setspeedChange(int speed){
        this.speed=0;
        System.out.println("현재 속도: "+this.speed);
        System.out.println("변경할 속도: "+this.speedChange);
        this.speed+=speedChange;
        System.out.println("변경된 속도 : "+this.speed);
    }

// 테스트중입니다
}

class bus extends vehicle{

    int fuel ;



    public bus(int num,int fuel){
        super(num);
        this.fuel =fuel;
    }


    void wowpassnger(int passenger){
        this.passenger+=passenger;
        if(passenger>30){
            System.out.println("정원초과입니다");
        } else {
            System.out.printf("탑승승객수:%d\n", this.passenger);
            System.out.printf("잔여승객수%d\n", 30 - this.passenger);
            System.out.printf("요금 확인:%d\n", this.passenger * 1000);
        }
    }

    void getfuel(boolean condition,int fuel) {
        Scanner se =new Scanner(System.in) ;
        System.out.println("운행을 계속하시겠습니까?");
        System.out.println("1.네");
        System.out.println("2.아니요");
        int sc =se.nextInt();
        if(sc==1){
            System.out.printf("운행상태 : 운행중\n");
            System.out.printf("주유량 :%d\n ",this.fuel);

        }
        else if(sc==2){
            this.condition=false;
            System.out.println("운행상태 : 차고지\n");
            System.out.println("주유량 : "+this.fuel +10);
        }
    }
    void fuelget(int fuel){
        this.fuel+=fuel;
        if(50>fuel){
            System.out.println("Full");

        }else if (5<=fuel){
            System.out.println("주유필요");
        }else {
            System.out.println("주유량:"+this.fuel);
        }
    }

}










class texi extends vehicle {
    String desnation;
    int distanc = 1;
    int price =3000;
    int distancerate = 1000;
    int oil =100;
    String conditon ="일반" ;
    int speed =0 ;
    String destination ;
    int allmoney;


    public texi(int num,int oil){
        super(num);
        this.oil= oil;
    }
    void getpep(int passenger){
        this.passenger+=passenger;
        if(passenger > 5){
            System.out.println("최대승객수초과");
        }else {
            System.out.printf("탑승승객수:%d\n",this.passenger);
            System.out.printf("잔여승객수%d\n",4-this.passenger);
            System.out.printf("요금 확인:%d\n",this.distanc*1000);
        }
    }
    void getpep1(String desnation,int distance){
        this.passenger+=passenger;
        System.out.printf("목적지%s\n",this.desnation);
        System.out.printf("목적지까지거리:%dkm\n",4-this.distanc,"km%c\n");
        System.out.printf("지불할요금:%d\n",this.distanc*1000);
        System.out.printf("상태:%s\n","운행중");

    }
    void wowfuel(int oil){
        this.oil+= oil;
        this.allmoney +=(distanc-1)*1000;

        if(this.oil<=5){
            System.out.printf("주유량= %d\n", this.oil);
            System.out.println("상태 = 운행불가");
            System.out.printf("누적요금= %d\n", this.allmoney);

        }else {
            System.out.printf("주유량= %d\n", this.oil);
            System.out.printf("누적요금= %d\n", this.allmoney);

        }

    }

}













class Main {
    public static void main(String[] args) {
        bus w =new bus(1000,300);
        w.wowpassnger(2);
        texi p =new texi(1000,1000);
        p.getpep(2);
        vehicle s =new vehicle(2) ;
        s.ridePeople(1);
        Scanner se =new Scanner(System.in);
        w.getfuel(true,2);
        p.getpep1("서울역",10);
    }
}