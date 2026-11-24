import java.util.*;

// Imagine you work for Crayola and your boss just told you that the Crayola1990 API needs a url slug generated for all of the color names.
// To do this, you need to lowercase and hyphenate each color in the list below:  'Sunset Orange' -> 'sunset-orange'
// You cannot edit the values in the list by hand as your boss wants code that can be applied to any set of crayola boxes in the future.
//
// Rules
//  - lowercase everything
//  - join the words with a single hyphen (watch out for extra spaces)
//  - remove apostrophes
//  - return a NEW list, leave the original untouched
//
// Expected: scarlet, sunset-orange, macaroni-and-cheese, robins-egg-blue, wild-blue-yonder, purple-mountains-majesty,
//           tickle-me-pink, pink-sherbert, jazzberry-jam, granny-smith-apple, mango-tango, tickle-me-pink
//
// BONUS (only if time remains): when two names produce the same slug, add a numeric suffix to the later ones
//           (the last item becomes tickle-me-pink-2)

class RealWorldApplication {
    static List<String> slugify(List<String> names) {
        // Solution1:
        // return names.stream().map(e->e.trim().replace("'", "").toLowerCase().replaceAll("\\s+", "-")).collect(Collectors.toList());

        // Solution2:
        Map<String,Integer> appearenceNums = new HashMap<>();
        List<String> result = new ArrayList<>();
        for(String name:names){
            String newName = name.trim().replace("'", "").toLowerCase().replaceAll("\\s+", "-");
            appearenceNums.put(newName, Optional.ofNullable(appearenceNums.get(newName)).orElse(0)+1);
            if (appearenceNums.get(newName)==1){
                result.add(newName);
            }else{
                result.remove(newName);
                result.add(newName.concat("-2"));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> crayola1990 = List.of(
            "Scarlet",
            "Sunset Orange",
            "Macaroni and Cheese",
            "Robin's Egg Blue",
            "  Wild Blue Yonder ",
            "Purple Mountains' Majesty",
            "Tickle Me Pink",
            "Pink  Sherbert",
            "Jazzberry Jam",
            "Granny Smith Apple",
            "Mango Tango",
            "TICKLE ME PINK"
        );

        System.out.println(slugify(crayola1990));
        // System.out.println(crayola1990);
    }
}


// ***** HINTS *******
// Remember strings are immutable but the value of a variable can be adjusted as often as needed.
// Take advantage of the methods your language gives you on strings (lowercase, trim, replace, split, join).
// Get the logic working for ONE name first, then loop over the list.
