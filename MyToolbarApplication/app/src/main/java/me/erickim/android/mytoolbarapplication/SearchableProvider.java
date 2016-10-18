package me.erickim.android.mytoolbarapplication;

import android.content.SearchRecentSuggestionsProvider;

/**
 * Created by kimeric on 10/16/16.
 */

public class SearchableProvider extends SearchRecentSuggestionsProvider{

    public static final String AUTHORITY = "me.erickim.android.mytoolbarapplication.SearchableProvider";
    public static final int MODE = DATABASE_MODE_QUERIES;

    public SearchableProvider() {
        setupSuggestions(AUTHORITY, MODE);

    }
}
