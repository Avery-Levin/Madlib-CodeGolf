fun main() {
    //Introduction
    println("What is your name?")
    val nameOfUser = readln().capitalize()
    println("Hello, $nameOfUser. Welcome to the shittiest robotics MadLib that has ever existed! What will happen is I will give you a part of speech (or potentially something more specific than that) and you will give me a word that corresponds with that part of speech. I will use these words to create a paragraph, which you won't be able to see until the end. Let's begin! (press enter to continue)")
    readln()
    var prompts = listOf("Name of a University", "Sport", "U.S. State", "Noun", "A verb ending in -ing", "Any word that starts with the same letter as the previous word", "integer", "integer", "integer", "integer", "integer", "integer", "integer", "integer", "integer", "noun","A word that ends in -ers, such as Raiders", "Adjective", "The name of the robotics team you are currently on", "A current world leader", "A previous year", "A short word", "A short word", "A short word", "Finally, name a city.")
    var answers = mutableListOf<String>()
    var questionsAsked : Int = 1
    for(currentPrompt in prompts){
       println(currentPrompt)
        answers.add(readln())
        questionsAsked += 1
    }
    println("Earlier today, in the ${answers[0]}'s ${answers[1]} stadium, robotics teams from around ${answers[2]} gathered to compete in the FIRST ${answers[3]} Challenge state championship. This year's game was known as ${answers[4]} ${answers[5]} . There were ${answers[6]} teams competing here today. \n There was a shocking turn of events during the qualification matches. Team number ${answers[7]}, known as the ${answers[15]} ${answers[16]}, who were widely expected to place first, ranked only ${answers[10]}. Conversely, team ${answers[11]} known as the ${answers[17]} Roboticists of ${answers[2]}, came out on top. \n During the elimination matches, teams ${answers[7]},${answers[11]}, ${answers[13]}, and ${answers[14]} were the alliance captains. Teams ${answers[7]} and ${answers[13]} won their respective matches and went on to finals. However, driver $nameOfUser of team ${answers[18]} demanded that their team be allowed to play. Head referee ${answers[19]} objected to this, and $nameOfUser was ejected from the venue like what happened in $${answers[20]}. However, the competition was so behind schedule at this point that finals were canceled. \n Several more upsets occurred during the awards ceremony. Thanks to their outreach efforts, team ${answers[13]} won the ${answers[21]} Award. The innovative design of team ${answers[13]} got them the ${answers[22]} award. Finally, due to their overall performance today, team ${answers[12]} won the very prestigious ${answers[23]} award, advancing them to the FIRST Championship in ${answers[24]}.")  }
