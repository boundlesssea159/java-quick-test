import java.util.*;

class ArraysExercise {
    public static void main(String[] args) {
        // The contacts list below is already populated.
        List<Contact> contacts = List.of(
            new Contact("Jake Overall", "jake.overall@boisecodeworks.com", "founder"),
            new Contact("Matt Overall", "matt.overall@boisecodeworks.com", "founder"),
            new Contact("Mark Ohnsman", "mark@boisecodeworks.com", "instructor"),
            new Contact("Darryl Kilzer", "darryl@boisecodeworks.com", "instructor"),
            new Contact("Tom Day", "tom@boisecodeworks.com", "instructor")
        );

        // 1. Print how many contacts are in the list.
        //    Expected: 5

        // 2. Create a new list named instructors that contains only the contacts whose title is 'instructor'.
        //    Do not modify the original contacts list.
        //    Expected: 3 contacts (Mark, Darryl, Tom)

        // 3. Using instructors, create a list named instructorEmails that contains only their email addresses.
        //    Expected: mark@boisecodeworks.com, darryl@boisecodeworks.com, tom@boisecodeworks.com
    }
}

record Contact(String name, String email, String title) {}
