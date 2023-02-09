package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object baseURL
     
    /**
     * <p></p>
     */
    public static Object username
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object social_media_link_1
     
    /**
     * <p></p>
     */
    public static Object social_media_link_2
     
    /**
     * <p></p>
     */
    public static Object social_media_link_3
     
    /**
     * <p></p>
     */
    public static Object job_category
     
    /**
     * <p></p>
     */
    public static Object edited_job_category
     
    /**
     * <p></p>
     */
    public static Object job_title
     
    /**
     * <p></p>
     */
    public static Object job_title_description
     
    /**
     * <p></p>
     */
    public static Object job_title_notes
     
    /**
     * <p></p>
     */
    public static Object edited_job_title
     
    /**
     * <p></p>
     */
    public static Object edited_job_title_description
     
    /**
     * <p></p>
     */
    public static Object edited_job_title_notes
     
    /**
     * <p></p>
     */
    public static Object nationality
     
    /**
     * <p></p>
     */
    public static Object edited_nationality
     
    /**
     * <p></p>
     */
    public static Object education
     
    /**
     * <p></p>
     */
    public static Object education_edited
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            baseURL = selectedVariables['baseURL']
            username = selectedVariables['username']
            password = selectedVariables['password']
            social_media_link_1 = selectedVariables['social_media_link_1']
            social_media_link_2 = selectedVariables['social_media_link_2']
            social_media_link_3 = selectedVariables['social_media_link_3']
            job_category = selectedVariables['job_category']
            edited_job_category = selectedVariables['edited_job_category']
            job_title = selectedVariables['job_title']
            job_title_description = selectedVariables['job_title_description']
            job_title_notes = selectedVariables['job_title_notes']
            edited_job_title = selectedVariables['edited_job_title']
            edited_job_title_description = selectedVariables['edited_job_title_description']
            edited_job_title_notes = selectedVariables['edited_job_title_notes']
            nationality = selectedVariables['nationality']
            edited_nationality = selectedVariables['edited_nationality']
            education = selectedVariables['education']
            education_edited = selectedVariables['education_edited']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
