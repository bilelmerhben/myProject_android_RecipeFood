package glsia.ds.projetds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FormActivity extends AppCompatActivity {
    EditText RecipName;
    EditText RecipeIngredients;
    EditText RecipeMethodTitle;
    EditText Recipe;
//    EditText Thumbnail;
    DatabaseReference reff;
    Recipes recipes ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        this.RecipName = findViewById(R.id.recipeName);
        this.RecipeIngredients = findViewById(R.id.recipeIngredients);
        this.RecipeMethodTitle = findViewById(R.id.recipeMethodTitle);
        this.Recipe = findViewById(R.id.recipe);
     //   this.Thumbnail = findViewById(R.id.thumbnail);

        Intent i = getIntent();
        reff = FirebaseDatabase.getInstance().getReference().child(i.getStringExtra("child_name"));
        recipes = new Recipes();
    }

    public void CommitData(View v) {

        String Recipe_Name = RecipName.getText().toString();
        String Recipe_Ingredients = RecipeIngredients.getText().toString();
        String Recipe_MethodTitle = RecipeMethodTitle.getText().toString();
        String Recipe_r = Recipe.getText().toString();
        int Thumbnail_l = R.drawable.test;

        recipes.setRecipeName(Recipe_Name);
        recipes.setRecipeIngredients(Recipe_Ingredients);
        recipes.setRecipeMethodTitle(Recipe_MethodTitle);
        recipes.setRecipe(Recipe_r);
        recipes.setThumbnail(Thumbnail_l);

        reff.push().setValue(recipes);
        //reff.child(name).setValue(student);


        Toast.makeText(getApplicationContext(), "Data inserted !", Toast.LENGTH_LONG).show();

        finish();
    }
}