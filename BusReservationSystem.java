import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;

    Bus(int no, boolean ac, int cap) {
        this.busNo = no;
        this.ac = ac;
        this.capacity = cap;
    }

    public int getBus() {
        return busNo;
    }

    public boolean isAc() {
        return ac;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setAc(boolean val) {
        ac = val;
    }

    public void setCapacity(int cap) {
        capacity = cap;
    }

    public void displayBusInfo() {
        System.out.println("BusNo- " + busNo + " AC- " + ac + " Total No Of Seats- " + capacity);
    }
}

class Booking {
    String passengerName;
    int busNo;
    Date date;

    Booking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        passengerName = sc.next();
        System.out.println("Enter Bus No: ");
        busNo = sc.nextInt();
        System.out.println("Enter date (dd-MM-yyyy): ");
        String dateInput = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity = 0;
        for (Bus bus : buses) {
            if (bus.getBus() == busNo) {
                capacity = bus.getCapacity();
                break;
            }
        }

        int booked = 0;
        for (Booking booking : bookings) {
            if (booking.busNo == busNo && booking.date.equals(date)) {
                booked++;
            }
        }

        return booked < capacity;
    }
}

public class BusReservationSystem {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>();
        buses.add(new Bus(1, true, 2));
        buses.add(new Bus(2, true, 30));
        buses.add(new Bus(3, false, 50));
        buses.add(new Bus(4, false, 20));

        Scanner sc = new Scanner(System.in);

        for (Bus b : buses) {
            b.displayBusInfo();
        }

        ArrayList<Booking> bookings = new ArrayList<>();

        int userOption = 1;
        while (userOption == 1) {
            System.out.println("Enter 1 to book and 2 to exit");
            userOption = sc.nextInt();
            if (userOption == 1) {
                Booking booking = new Booking();
                if (booking.isAvailable(bookings, buses)) {
                    bookings.add(booking);
                    System.out.println("Your Booking is confirmed");
                } else {
                    System.out.println("Sorry..Bus is full. Try another bus or date.");
                }
            }
        }
    }
}
