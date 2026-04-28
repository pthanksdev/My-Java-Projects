import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in);
        System.out.println("A Murder in the Apartment: A Choice Game");
        System.out.println("Choose your character:");
        System.out.println("1. Detective Harlow");
        System.out.println("2. Lena");
        System.out.println("3. Marcus");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You are Detective Harlow, assigned to investigate the murder of Evan,\n " +
                        "a young man found dead in his apartment. Two roommates Lena and Marcus are\n " +
                        "your prime suspects" + ", but both claim innocence. Its your job to sift\n " +
                        "through their stories, find clues, and determine who the real killer is.\n" +
                        "\nYour choices will affect the outcome of the investigation.\n " +
                        "Will you uncover the truth, arrest the wrong person, or let a killer walk free?\n" +
                        "\nScene 1: The Arrival");
                System.out.println("You arrive at the crime scene. Evans body is sprawled out on the living\n " +
                        "room floor, blood pooling beneath him. Two roommate Lena and Marcus\n" +
                        "are present, both looking shaken.\n" + "\nWhat do you do first?");
                System.out.println("1. Secure the crime scene and gather physical evidence.\n" +
                        "2. Immediately separate Lena and Marcus for questioning.\n" +
                        "3. Examine the body for any obvious signs of struggle or clues.\n");
                choice = scanner.nextInt();
                System.out.println("You have chosen " + choice);

                System.out.println("Scene 2: The Initial Questioning\n" +
                        "You begin your initial interviews. Marcus seems nervous,\n" +
                        "while Lena appears more shocked than anything else.Both insist they are innocent.\n" +
                        "\nWho do you question first?");
                System.out.println("1. Question Marcus. His nervous behavior could be hiding something.\n" +
                        "2. Question Lena. Her calmness might be a cover for guilt.\n" +
                        "3. Have an officer question them while you examine the apartment for clues.\n");
                choice = scanner.nextInt();
                System.out.println("You have chosen " + choice);

                System.out.println("Scene 3: The Alibis\n" +
                        "Youve questioned both Lena and Marcus. Their stories are shaky.\n" +
                        "Lena claims she was out running errands, but no one can verify her exact \n" +
                        "location. Marcus says he was in his room, but youre not convinced.\n" +
                        "\nWhat do you focus on?");
                System.out.println("1. Lenas alibi. Her phone records show a call near the time of death, but not from where she said she was.\n" +
                        "2. Marcuss behavior. He seems to be hiding something about the argument he had with Evan earlier.\n" +
                        "3. Neither for now. Instead, focus on gathering physical evidence around the apartment.");
                choice = scanner.nextInt();
                System.out.println("You have chosen " + choice);

                System.out.println("Scene 4: The Argument\n" +
                        "One of the neighbors mentions overhearing an argument earlier in the evening,\n" +
                        "likely between Evan and Marcus. Marcus admitted to arguing with Evan but \n" +
                        "insists it wasnt serious.\n" + "\nWhats your next move?");
                System.out.println("1. Press Marcus harder about the argument. What were they really fighting about?\n" +
                        "2. Confront Lena and see if she knew about the argument. Could she have intervened?\n" +
                        "3. Review any other evidence—such as texts or emails—that could shed light on what the argument was about.");
                choice = scanner.nextInt();
                System.out.println("You have chosen " + choice);

                System.out.println("Scene 5: The Headphones\n" +
                        "You find a pair of bloodstained headphones near Evan’s body.\n" +
                        "They belong to Marcus. He claims he never used them that day and has no\n" +
                        "idea how they ended up there.\n" +
                        "\nWhat do you do?");
                System.out.println("1. Confront Marcus about the headphones. If he lied, this could be the key to the case.\n" +
                        "2. Test the headphones for fingerprints and DNA to see who else may have handled them.\n" +
                        "3. Question Lena about the headphones. Did she see Marcus use them recently?\n");
                choice = scanner.nextInt();
                System.out.println("You have chosen " + choice);

                System.out.println("Scene 6: Lenas Call\n" +
                        "Lena’s phone records show she made a call near the time of Evans death,\n" +
                        "but she wasnt where she said she was. When you confront her,\n" +
                        "she becomes defensive but insists the call was innocent.\n" +
                        "\nHow do you proceed?");
                System.out.println("1. Press Lena on the inconsistency in her alibi. Could she be hiding something?\n" +
                        "2. Focus on the physical evidence. The call might not matter if the evidence tells a clearer story.\n" +
                        "3. Question Marcus again about Lenas behavior. Did he notice anything strange about her that day?\n");
                choice = scanner.nextInt();
                System.out.println("You have chosen " + choice);

                System.out.println("Scene 7: The Final Confrontation\n" +
                        "After reviewing the evidence, you gather Marcus and Lena in the living room.\n" +
                        "The tension is thick. You have a feeling one of them is guilty,\n" +
                        "but its time to make your move.\n" +
                        "\nWhat do you do?");
                System.out.println("1. Confront Marcus with the evidence of the headphones and the argument. Push him to confess.\n" +
                        "2. Confront Lena about her alibi and the strange phone call. Press her on what she was really doing.\n" +
                        "3. Lay out all the evidence in front of both suspects and see who cracks first.\n");
                choice = scanner.nextInt();
                System.out.println("You have chosen " + choice);
                switch (choice) {
                    case 1:
                        System.out.println("Marcus is arrested: If you press Marcus hard enough and \n" +
                                "reveal all the evidence against him—especially the argument and\n" +
                                "the bloodstained headphones—he breaks down and confesses.\n" +
                                "It turns out Marcus killed Evan in a fit of rage during their argument.\n" +
                                "Case closed.\n" +
                                "\nYou have won the game");

                        break;
                    case 2:
                        System.out.println("Lena is arrested: If you focus on Lena’s inconsistent alibi and press her about the phone call, you uncover a hidden motive—Lena and Evan had been fighting over a secret loan.\n" +
                                "Lena finally confesses, admitting that she lashed out in a moment of panic.\n" +
                                "Marcus is cleared.\n" +
                                "\nYou have failed.");
                        break;
                    case 3:
                        System.out.println("Both remain suspects: If you fail to build a strong case against\n " +
                                "either suspect or miss key pieces of evidence, neither Marcus nor Lena cracks\n" +
                                "under pressure. The case remains unsolved, and both suspects walk free.\n" +
                                "Evan’s killer is never definitively identified.\n" +
                                "\nYou have failed the game.");
                        break;
                    default:
                        System.out.println("There is an error in the game");
                }
                break;
            case 2:
                System.out.println("You are Lena, one of three roommates living in a quiet apartment.\n" +
                        "One evening, you come home to a horrifying scene: your roommate Evan is dead\n " +
                        "on the living room floor. Your other roommate, Marcus, is acting strangely.\n" +
                        "The police have arrived, and both you and Marcus are suspects in Evan’s murder.\n" +

                        "\nYour choices will determine whether you find out the truth, get falsely \n" +
                        "accused, or if the real killer goes free. Choose wisely.\n" + "\nScene 1: The Discovery");
                System.out.println("You walk into the apartment after a long day at work.\n" +
                        "The front door creaks open, and you immediately notice something off.\n" +
                        "The apartment is unusually quiet.\n" + "You see Evan lying motionless on the floor,\n" +
                        "blood pooling around him.\n" +
                        "\nWhat do you do?");
                System.out.println("1. Scream for help.\n" +
                        "2. Check if Evan is still alive.\n" +
                        "3. Step back and call the police.");
                choice = scanner.nextInt();
                System.out.println("You have chosen " + choice);

                System.out.println("Scene 2: Marcus Appears");
                System.out.println("You decide to choose the " + choice + "choice");
                System.out.println("Suddenly, Marcus appears from his bedroom. He looks shocked \n" +
                        "when he sees Evans body, but something about his reaction seems off.\n" +
                        "\nWhat do you ask Marcus?");
                System.out.println("1. Did you hear or see anything?\n" +
                        "2. Why are you coming out now?\n" +
                        "3. Say nothing and focus on calling the police.");
                choice = scanner.nextInt();
                System.out.println("You have chosen " + choice);

                System.out.println("Scene 3: The Investigation Begins\n" +
                        "The police arrive shortly after. Detective Harlow begins questioning both\n" +
                        "of you. She asks you to recount your day and what you know about\n" +
                        "Evan and Marcus.\n" +
                        "\nHow do you respond?");
                System.out.println("1. I came home from work and found him like this. I didn’t see or hear \n" +
                        "anything before.\n" +
                        "2. I had an argument with Evan the other day, but I would never hurt him.\n" +
                        "3. I dont know what happened, but Marcus was acting weird when I got here.\n");
                choice = scanner.nextInt();
                System.out.println("You have chosen " + choice);

                System.out.println("Scene 4: Suspicion Grows\n" +
                        "The detective begins to suspect both you and Marcus. During\n" +
                        "questioning, she reveals that Marcus admitted to an argument\n" +
                        "with Evan earlier that evening, but claims it wasn’t serious. She also\n" +
                        "brings up your alibi—your phone records show you made a call near\n" +
                        "the time of Evan’s death, but you weren't at work.\n" +
                        "\nWhat do you do?");
                System.out.println("1. Stick to your story and explain the call as a casual check-in with Evan.\n" +
                        "2. Accuse Marcus directly and say he’s lying about the argument.\n" +
                        "3. Ask for a lawyer and refuse to answer more questions.");
                choice = scanner.nextInt();
                System.out.println("You have chosen " + choice);

                System.out.println("Scene 5: The Clue\n" +
                        "Later that evening, the police find a pair of headphones near Evans \n" +
                        "body. Detective Harlow pulls you aside.There’s blood on these. \n" +
                        "They belong to Marcus, but we need to be sure.\n" +
                        "\nWhat do you do?");
                System.out.println("1. Tell the detective about the argument you overheard between Marcus and Evan earlier that week.\n" +
                        "2. Say you have no idea where the headphones came from.\n" +
                        "3. Ask the detective to check for Marcuss fingerprints on the headphones.\n");
                choice = scanner.nextInt();
                System.out.println("You have chosen " + choice);

                System.out.println("Scene 6: The Final Confrontation\n" +
                        "Detective Harlow gathers you and Marcus in the living room.One of \n" +
                        "you is lying, she says, looking between you both.Weve found\n" +
                        "Marcus fingerprints on the headphones, but the timing of your call,\n" +
                        "Lena, is still suspicious.\n" +
                        "\nWhat’s your final move?");
                System.out.println("1. Accuse Marcus of killing Evan and demand he confess.\n" +
                        "2. Stay silent and let the detective piece it together.\n" +
                        "3. Admit that you and Marcus both had reasons to be angry at Evan, but insist you didn’t kill him.");

                switch (choice) {
                    case 1:
                        System.out.println("Marcus is arrested: If you successfully choose the right\n" +
                                "path and provide enough evidence against Marcus, the\n" +
                                "detective arrests him. The truth comes out that Marcus killed\n" +
                                "Evan in a fit of rage over an argument about money.\n" +
                                "\nYou have won the game");
                        break;
                    case 2:
                        System.out.println(" You are arrested: If you fail to provide a solid alibi or \n" +
                                "focus too much on defending yourself without confronting Marcus,\n" +
                                "the detective turns her suspicion on you. You are arrested, and\n" +
                                "\nMarcus walks free.\n" +
                                "You have lost the game");
                        break;
                    case 3:
                        System.out.println(" Both get away with it: If you choose poorly, fail to\n" +
                                "cooperate with the investigation, or avoid confronting Marcus,\n" +
                                "the detective might not have enough evidence. Both of you \n" +
                                "remain suspects, but the case goes cold, and the real killer\n" +
                                "\nMarcus gets away.\n" +
                                "You have lost the game");
                }
                break;
            default:
                System.out.println("There is an error in the game");

            case 3:
                System.out.println("You are Marcus, one of three roommates living in a quiet apartment.\n" +
                        "One evening, you get into a heated argument with your roommate Evan\n" +
                        "over money. You go to your room, but soon after, you hear a loud thud.\n" +
                        "You walk out to find Evan dead on the living room floor. Panic sets in.\n" +
                        "Your other roommate, Lena, walks in shortly after, and now both of you are suspects.\n" +
                        "\nYour choices will determine whether you can clear your name, cover up\n" +
                        "your involvement, or get caught. Choose carefully\n" +
                        "\nScene 1: The Argument");
                System.out.println("Earlier in the evening, you and Evan had a heated argument about\n" +
                        "unpaid rent. Evan stormed out, but you know he’ll be back. The tension\n" +
                        "in the apartment is thick.\n" +
                        "\nWhat do you do?");
                System.out.println("1.Try to calm down and stay in your room.\n" +
                        "2. Follow Evan and try to settle the argument now.\n" +
                        "3. Call a friend to vent about the situation.\n");
                choice = scanner.nextInt();
                System.out.println("Your have chosen " + choice);

                System.out.println("Scene 2: The Discovery\n" +
                        "A loud noise jolts you from your thoughts. You rush into the living room\n" +
                        "to find Evan on the floor, dead. Panic rises in your chest.\n" +
                        "\nWhat do you do?");
                System.out.println("1. Go back to your room and pretend you heard nothing.\n" +
                        "2. Check Evans pulse, even though you know its too late.\n" +
                        "3. Wipe down anything you may have touched in the room and try to calm yourself.");
                choice = scanner.nextInt();
                System.out.println("Your have chosen " + choice);

                System.out.println("Scene 3: Lena Walks In\n" +
                        "Lena enters the apartment, and her eyes go wide when she sees\n" +
                        "Evans body. She looks at you, confused and terrified.\n" +
                        "\nWhat do you say?");
                System.out.println("1. I dont know what happened. I just found him like this!\n" +
                        "2. It wasnt me I heard a noise, and when I came out, he was already like this.\n" +
                        "3. Say nothing and let her make the first move.");
                choice = scanner.nextInt();
                System.out.println("Your have chosen " + choice);

                System.out.println("Scene 4: The Police Arrive\n" +
                        "The police arrive, and Detective Harlow begins her investigation. Both\n" +
                        "you and Lena are questioned separately. Harlow is sharp, and you\n" +
                        "need to be careful.\n" +
                        "\nHow do you explain your whereabouts during the murder?");
                System.out.println("1. I was in my room listening to music. I didnt hear anything.\n" +
                        "2. I was out for a bit but came back just before Lena. I didnt see anything until I walked in.\n" +
                        "3. Evan and I argued, but I swear I didnt hurt him.");
                choice = scanner.nextInt();
                System.out.println("Your have chosen " + choice);

                System.out.println("Scene 5: Lenas Alibi\n" +
                        "Detective Harlow tells you Lena’s alibi is shaky. Her phone records show\n" +
                        "she made a call around the time of Evan’s death, but she wasnt where\n" +
                        "she said she was. This could be your chance to shift suspicion onto her.\n" +
                        "\nWhat do you do?");
                System.out.println("1. Tell the detective you think Lena is hiding something and emphasize her strange behavior.\n" +
                        "2. Say nothing and hope the detective focuses on Lena naturally.\n" +
                        "3. Deflect attention by claiming you saw someone suspicious outside earlier.");
                choice = scanner.nextInt();
                System.out.println("Your have chosen " + choice);

                System.out.println("Scene 6: The Evidence\n" +
                        "The detective finds your headphones near Evan’s body, stained with blood.\n" +
                        "She confronts you with this information, her eyes watching for any signs of guilt.\n" +
                        "How do you respond?\n" +
                        "\n" +
                        "1.Those arent mine! Evan must have borrowed them.\n" +
                        "2. I dont know how they got there. I never even used them today.\n" +
                        "3. Evan and I had a fight earlier, but I swear I didnt touch him after that.");
                choice = scanner.nextInt();
                System.out.println("Your have chosen " + choice);

                System.out.println("Scene 7: The Final Interrogation\n" +
                        "\n" +
                        "Detective Harlow gathers both you and Lena in the living room. She \n" +
                        "knows one of you is lying and is close to breaking the case. The tension\n" +
                        "in the room is unbearable.\n" +
                        "\n" +
                        "What’s your next move?\n" +
                        "\n" +
                        "1. Accuse Lena of framing you and insist she had a motive.\n" +
                        "2. Stick to your story and refuse to say more without a lawyer.\n" +
                        "3. Break down and admit you were there when Evan was killed, but it \n" +
                        "was an accident.\n");
                choice = scanner.nextInt();
                System.out.println("Your have chosen " + choice);

                switch (choice) {
                    case 1:
                        System.out.println("You get arrested: If you fail to provide a solid cover story \n" +
                                "and the evidence mounts against you, Detective Harlow arrests you.\n " +
                                "You are charged with Evan’s murder, and Lena is cleared.\n" + "\n" +
                                "You have lost the game");
                        break;
                    case 2:
                        System.out.println("Lena gets arrested: If you successfully deflect suspicion\\n" +
                                "onto Lena by casting doubt on her alibi and emphasizing her odd \n" +
                                "behavior, the detective arrests her. You walk free, though guilt lingers.\n" + "\n" +
                                "You have won the game");
                        break;
                    case 3:
                        System.out.println("Both of you remain suspects: If your story doesn’t hold up\n" +
                                "  but there’s not enough evidence to convict, the case remains\n" +
                                "unsolved. Both you and Lena are left to live with the weight of\n" +
                                "suspicion, and Evan’s killer may never be known.");
                        break;
                    default:
                        System.out.println("There has been an error in the game");
                }
                break;
        }
        }catch (Exception e){
            System.out.println("Theres an error in the game");
        }
    }
}