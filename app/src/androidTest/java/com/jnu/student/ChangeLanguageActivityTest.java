package com.jnu.student;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ChangeLanguageActivityTest {
    @Rule
    public ActivityTestRule<ChangeLanguageMainActivity> activityRule =
            new ActivityTestRule<>(ChangeLanguageMainActivity.class);

    @Test
    public void testChangeLanguage() {
        ViewInteraction editText41 = Espresso.onView(
                allOf(withId(R.id.edit_text_country),
                        isDisplayed()));
        editText41.check(matches(withText("en")));

        ViewInteraction textView41 = onView(
                allOf(withId(R.id.text_view_language),
                        isDisplayed()));
        textView41.check(matches(withText("Language")));

        ViewInteraction button41 = onView(
                allOf(withId(R.id.button_change_language),
                        isDisplayed()));
        button41.check(matches(withText("Change language")));

        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.edit_text_country),
                        isDisplayed()));
        appCompatEditText.perform(click());
        appCompatEditText.perform(replaceText("cn"));

        appCompatEditText.perform(closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.button_change_language),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction textView = onView(
                allOf(withId(R.id.text_view_language),
                        isDisplayed()));
        textView.check(matches(withText("语言")));

        ViewInteraction button = onView(
                allOf(withId(R.id.button_change_language),
                        isDisplayed()));
        button.check(matches(withText("改变语言")));

        ViewInteraction editText = onView(
                allOf(withId(R.id.edit_text_country),
                        isDisplayed()));
        editText.check(matches(withText("cn")));

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.edit_text_country),
                        isDisplayed()));
        appCompatEditText5.perform(click());

        ViewInteraction appCompatEditText6 = onView(
                allOf(withId(R.id.edit_text_country),
                        isDisplayed()));
        appCompatEditText6.perform(replaceText("jp"));

        ViewInteraction appCompatEditText7 = onView(
                allOf(withId(R.id.edit_text_country),
                        isDisplayed()));
        appCompatEditText7.perform(closeSoftKeyboard());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.button_change_language),
                        isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.text_view_language),
                        isDisplayed()));
        textView2.check(matches(withText("言語")));

        button = onView(
                allOf(withId(R.id.button_change_language),
                        isDisplayed()));
        button.check(matches(withText("言語を変更する")));

        ViewInteraction editText2 = onView(
                allOf(withId(R.id.edit_text_country),
                        isDisplayed()));
        editText2.check(matches(withText("jp")));

        ViewInteraction appCompatEditText8 = onView(
                allOf(withId(R.id.edit_text_country),
                        isDisplayed()));
        appCompatEditText8.perform(click());

        ViewInteraction appCompatEditText9 = onView(
                allOf(withId(R.id.edit_text_country),
                        isDisplayed()));
        appCompatEditText9.perform(replaceText("kr"));

        ViewInteraction appCompatEditText10 = onView(
                allOf(withId(R.id.edit_text_country),
                        isDisplayed()));
        appCompatEditText10.perform(closeSoftKeyboard());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.button_change_language),
                        isDisplayed()));
        appCompatButton3.perform(click());

        ViewInteraction editText3 = onView(
                allOf(withId(R.id.edit_text_country),
                        isDisplayed()));
        editText3.check(matches(withText("kr")));

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.text_view_language),
                        isDisplayed()));
        textView3.check(matches(withText("언어")));
        button = onView(
                allOf(withId(R.id.button_change_language),
                        isDisplayed()));
        button.check(matches(withText("언어 변경")));

        ViewInteraction appCompatEditText11 = onView(
                allOf(withId(R.id.edit_text_country),
                        isDisplayed()));
        appCompatEditText11.perform(click());

        ViewInteraction appCompatEditText12 = onView(
                allOf(withId(R.id.edit_text_country),
                        isDisplayed()));
        appCompatEditText12.perform(replaceText("en"));

        ViewInteraction appCompatEditText13 = onView(
                allOf(withId(R.id.edit_text_country),
                        isDisplayed()));
        appCompatEditText13.perform(closeSoftKeyboard());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.button_change_language),
                        isDisplayed()));
        appCompatButton4.perform(click());

        ViewInteraction editText4 = onView(
                allOf(withId(R.id.edit_text_country),
                        isDisplayed()));
        editText4.check(matches(withText("en")));

        ViewInteraction textView4 = onView(
                allOf(withId(R.id.text_view_language),
                        isDisplayed()));
        textView4.check(matches(withText("Language")));

        button = onView(
                allOf(withId(R.id.button_change_language),
                        isDisplayed()));
        button.check(matches(withText("Change language")));
    }
}
