package com.instaclone.instaclone.model.facts;

import com.instaclone.instaclone.model.Profile;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProfileSuggestion {
    private Profile profile;
    private double similarity;
}
