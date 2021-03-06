package e.elemcla.helloworldapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static e.elemcla.helloworldapp.MainActivity.qr;

public class treasure extends AppCompatActivity {

    private final static String ERROR_MESSAGE = "Unable to scan bar code";
    private boolean isScanned=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treasure);

        if (getSupportActionBar() != null ) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }



        ImageView imageView = findViewById(R.id.imageView);
        TextView textView = findViewById(R.id.textView);


        System.out.println(qr+"xxxxxxxxxxxxxx");

            switch (Integer.valueOf(qr))
            {
                case 1:
                    System.out.println("Hint 1");
                    Toast.makeText(treasure.this, "You found hint 1!", Toast.LENGTH_LONG).show();

                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.larsmagnus));
                    textView.setText("Start Your treasure Hunt Journey! \n\n Hint 1: \nFind Ericsson's First Name... ");


                    break;

                case 2:
                    System.out.println("Hint 2");
                    Toast.makeText(treasure.this, "You found hint 2!", Toast.LENGTH_LONG).show();

                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.trumpstar));
                    textView.setText("Jeez Sherlock, you found the first clue! \n\n Now for Hint 2: \nComplete this lyric by a famous Irish Band: \n\t 'Standing in the ____ __ ____'");


                    break;

                case 3:
                    System.out.println("Hint 3");
                    Toast.makeText(treasure.this, "You found hint 3!", Toast.LENGTH_LONG).show();


                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.brickwall));
                    textView.setText("Ok you've found the first 2 ... don't get cocky now we're just getting started. \n\n Hint 3: \n'Mr. Gorbachev  -tear down this wall.' -Ronald Reagan" );


                    break;

                case 4:
                    System.out.println("Hint 4");
                    Toast.makeText(treasure.this, "You found hint 4!", Toast.LENGTH_LONG).show();

                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.pinkhandbag));
                    textView.setText("First 3 down! Nice job! \n\n Hint 4: \nFind the Fashion Capital, and pick up a slice of margarita on the way.");

                    break;

                case 5:
                    System.out.println("Hint 5");
                    Toast.makeText(treasure.this, "You found hint 5!", Toast.LENGTH_LONG).show();

                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.house));
                    textView.setText("Keep on moving, moving! \n\nOn to Hint 5:\nGo back to the place you call home");

                    break;

                case 6:
                    System.out.println("Hint 6");
                    Toast.makeText(treasure.this, "You found hint 6!", Toast.LENGTH_LONG).show();

                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.jenson));
                    textView.setText("5 down....we're just warming up. \n\nSo for Hint 6, tell me: \nWho won the 2009 FIA Formula 1 championship?");

                    break;

                case 7:
                    System.out.println("Hint 7");
                    Toast.makeText(treasure.this, "You found hint 7!", Toast.LENGTH_LONG).show();

                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.micky));
                    textView.setText("Nearly half way, pick up steam instead of losing hope! \n\nFor Hint 7: \nFind Michael Jackson's Daughter ");

                    break;

                case 8:
                    System.out.println("Hint 8");
                    Toast.makeText(treasure.this, "You found hint 8!", Toast.LENGTH_LONG).show();

                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.ericsonlogo));
                    textView.setText("Good job!! 7 done, \n\nHint 8: \nGo to where it all began");

                    break;

                case 9:
                    System.out.println("Hint 9");
                    Toast.makeText(treasure.this, "You found hint 9!", Toast.LENGTH_LONG).show();

                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.chickenkiev));
                    textView.setText("Hint 9 is for the food lovers: \n\nThis dish does not originate from the capital of Ukraine");

                    break;

                case 10:
                    System.out.println("Hint 10");
                    Toast.makeText(treasure.this, "You found hint 10!", Toast.LENGTH_LONG).show();

                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.musicsymbol));
                    textView.setText("9 done...you're obviously too good at this, I'm going to pump up the difficulty. \n\nHint 10: \nName Paul Simon's second single from his second album");

                    break;

                case 11:
                    System.out.println("Hint 11");
                    Toast.makeText(treasure.this, "You found hint 11!", Toast.LENGTH_LONG).show();

                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.books));
                    textView.setText("Ok that one was tough so for. \n\nHint 11:\nStep back a few years if you're stuck, get your head out of your screen and look at a book");

                    break;

                case 12:
                    System.out.println("Hint 12");
                    Toast.makeText(treasure.this, "You found hint 12!", Toast.LENGTH_LONG).show();

                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.camera));
                    textView.setText("Such an accomplishment to have 11 done! \n\nHint 12: \nThis moment has to be captured, say cheese!!!");

                    break;

                case 13:
                    System.out.println("Hint 13");
                    Toast.makeText(treasure.this, "You found hint 13!", Toast.LENGTH_LONG).show();

                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.johnadams));
                    textView.setText("12 clues solved, but Hint 13: \nis for all of you History buffs, who was John Adams Vice President to? ");

                    break;

                case 14:
                    System.out.println("Hint 14");
                    Toast.makeText(treasure.this, "You found hint 14!", Toast.LENGTH_LONG).show();

                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.laughface));
                    textView.setText("You're nearing the end, \n\nso Hint 14 will act as a piece of advice: \nMake sure you leave the 8 until last...");

                    break;

                case 15:
                    System.out.println("Hint15");
                    Toast.makeText(treasure.this, "You found hint 15!", Toast.LENGTH_LONG).show();

                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.chicken));
                    textView.setText("Here's the final clue: \nSolve it to skip the queue...");

                    break;

                case 16:
                    System.out.println("Hint 16");
                    Toast.makeText(treasure.this, "You found hint 16!", Toast.LENGTH_LONG).show();

                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.medel));
                    textView.setText("Congratulations!!! \nWinner winner, chicken dinner, go to reception to collect your prize");

                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.ericsson_logo));
                  //  textView.setText("You found hint 3");
                    break;

               default:
                   System.out.println("Not a hint isbn");
                   break;
            }
        }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
    }

