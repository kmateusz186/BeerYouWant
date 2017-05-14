package com.example.mati.beeryouwant;

import com.example.mati.beeryouwant.model.ALevel;
import com.example.mati.beeryouwant.model.BMLevel;
import com.example.mati.beeryouwant.model.Beer;
import com.example.mati.beeryouwant.model.Country;
import com.example.mati.beeryouwant.model.Province;
import com.example.mati.beeryouwant.model.Style;
import com.example.mati.beeryouwant.model.Works;

import java.util.List;

public interface DataManager {
    ALevel getALevel( int idALevel );
    List<ALevel> getALevels();

    BMLevel getBMLevel( int idBMLevel );
    List<BMLevel> getBMLevels();

    Beer getBeer(int idBeer );
    List<Beer> getBeers();
    /*int saveBeer( Beer beer);
    boolean deleteBeer(int idBeer);
    boolean updateBeer (Beer beer);*/

    Country getCountry(int idCountry );
    List<Country> getCountries();
   /* int saveCountry( Country country);
    boolean deleteCountry(int idCountry);
    boolean updateCountry (Country country);*/

    Province getProvince(int idProvince );
    List<Province> getProvinces();
    /*int saveProvince( Province province);
    boolean deleteProvince(int idProvince);
    boolean updateProvince (Province province);*/

    Style getStyle(int idStyle );
    List<Style> getStyles();
    List<Style> getChosenStyles(String color, int bitter, int malt, int alcohol, String wheat_malt, String fermentation);
    /*int saveStyle( Style style);
    boolean deleteStyle(int idStyle);
    boolean updateStyle (Style Style);*/

    Works getWorks(int idWorks );
    List<Works> getWorkses();
    /*int saveWorks( Works works);
    boolean deleteWorks(int idWorks); */
    boolean updateWorks (Works works);
    List<Works> getFavouriteWorks();

}
