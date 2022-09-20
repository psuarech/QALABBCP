package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.SearchDetailsScreen;
import com.nttdata.screens.SearchScreen;
import com.nttdata.screens.YoutubeScreen;
import net.thucydides.core.annotations.Step;
import org.jruby.RubyProcess;

public class YoutubeSteps {

    YoutubeScreen youtubeScreen;

    @Step("Búsqueda por texto {0}")
    public void searchByText(String place){
           youtubeScreen.clickSearchInput(place);


        //searchDetailsScreen.enterSearchInput(place);
        //searchDetailsScreen.clickFirstOption();
        //searchDetailsScreen.clickNext();
        //searchDetailsScreen.clickSearch();
    }

    @Step("Obtiene el texto del resultado")
    public String getResultText(){
        return youtubeScreen.getResutltText();
    }
}
