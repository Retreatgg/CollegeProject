package com.example.college.dao;

import com.example.college.model.EmployerAssessment;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class EmployerAssessmentDao {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private final JdbcTemplate jdbcTemplate;

    public void createEmployerAssessment(EmployerAssessment assessment) {
        String sql = """
                insert into EMPLOYER_ASSESSMENT(
                educational_programs, start_year_cooperation, count_completed_internship, 
                count_employed, count_working_in_their_specialty, student_training, professional_training_graduates, 
                general_theoretical_training, basic_practical_skills, written_and_oral_literacy, 
                ability_to_acquire_new_knowledge, student_abilities, creativity, importance_foreign_languages, 
                need_for_interpersonal_skills, work_skills, teamwork_skills, independent_workskills, 
                questions_in_the_questionnaire, your_suggestions, your_suggestions_for_changes, date_of_passage
                ) 
                values (
                :educational_programs, :start_year_cooperation, :count_completed_internship, 
                :count_employed, :count_working_in_their_specialty, :student_training, :professional_training_graduates,
                :general_theoretical_training, :basic_practical_skills, :written_and_oral_literacy, 
                :ability_to_acquire_new_knowledge, :student_abilities, :creativity, :importance_foreign_languages,
                :need_for_interpersonal_skills, :work_skills, :teamwork_skills, :independent_workskills,
                :questions_in_the_questionnaire, :your_suggestions, :your_suggestions_for_changes, :date_of_passage
                )
                """;

        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource()
                .addValue("educational_programs", assessment.getEducationalPrograms())
                .addValue("start_year_cooperation", assessment.getStartYearCooperation())
                .addValue("count_completed_internship", assessment.getCountCompletedInternship())
                .addValue("count_employed", assessment.getCountEmployed())
                .addValue("count_working_in_their_specialty", assessment.getCountWorkingInTheirSpecialty())
                .addValue("student_training", assessment.getStudentTraining())
                .addValue("professional_training_graduates", assessment.getProfessionalTrainingGraduates())
                .addValue("general_theoretical_training", assessment.getGeneralTheoreticalTraining())
                .addValue("basic_practical_skills", assessment.getBasicPracticalSkills())
                .addValue("written_and_oral_literacy", assessment.getWrittenAndOralLiteracy())
                .addValue("ability_to_acquire_new_knowledge", assessment.getAbilityToAcquireNewKnowledge())
                .addValue("student_abilities", assessment.getStudentAbilities())
                .addValue("creativity", assessment.getCreativity())
                .addValue("importance_foreign_languages", assessment.getImportanceForeignLanguages())
                .addValue("need_for_interpersonal_skills", assessment.getNeedForInterpersonalSkills())
                .addValue("work_skills", assessment.getWorkSkills())
                .addValue("teamwork_skills", assessment.getTeamworkSkills())
                .addValue("independent_workskills", assessment.getIndependentWorkSkills())
                .addValue("questions_in_the_questionnaire", assessment.getQuestionsInTheQuestionnaire())
                .addValue("your_suggestions", assessment.getYourSuggestions())
                .addValue("your_suggestions_for_changes", assessment.getYourSuggestionsForChanges())
                .addValue("date_of_passage", assessment.getDateOfPassage()));
    }


    public List<String> getYourSuggestionsForChanges() {
        String sql = """
                select YOUR_SUGGESTIONS_FOR_CHANGES from EMPLOYER_ASSESSMENT
                """;

        return jdbcTemplate.queryForList(sql, String.class);
    }

    public List<String> getYourSuggestions() {
        String sql = """
                select YOUR_SUGGESTIONS from EMPLOYER_ASSESSMENT
                """;

        return jdbcTemplate.queryForList(sql, String.class);
    }

    public List<String> getQuestionsInTheQuestionnaire() {
        String sql = """
                select QUESTIONS_IN_THE_QUESTIONNAIRE from EMPLOYER_ASSESSMENT
                """;

        return jdbcTemplate.queryForList(sql, String.class);
    }

    public List<Map<String, Object>> getCountCompletedInternship() {
        String sql = """
                select COUNT_COMPLETED_INTERNSHIP, count(*) as count from EMPLOYER_ASSESSMENT group by COUNT_COMPLETED_INTERNSHIP
                """;

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getCountEmployed() {
        String sql = """
                select COUNT_EMPLOYED, count(*) as count from EMPLOYER_ASSESSMENT group by "COUNT_EMPLOYED"
                """;

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getCountWorkingInTheirSpecialty() {
        String sql = """
                select COUNT_WORKING_IN_THEIR_SPECIALTY, count(*) as count from EMPLOYER_ASSESSMENT group by "COUNT_WORKING_IN_THEIR_SPECIALTY"
                """;

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getStudentTraining() {
        String sql = """
                select STUDENT_TRAINING, count(*) as count from EMPLOYER_ASSESSMENT group by "STUDENT_TRAINING"
                """;

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getProfessionalTrainingGraduates() {
        String sql = """
                select PROFESSIONAL_TRAINING_GRADUATES, count(*) as count from EMPLOYER_ASSESSMENT group by "PROFESSIONAL_TRAINING_GRADUATES"
                """;

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getGeneralTheoreticalTraining() {
        String sql = """
                select GENERAL_THEORETICAL_TRAINING, count(*) as count from EMPLOYER_ASSESSMENT group by "GENERAL_THEORETICAL_TRAINING"
                """;

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getBasicPracticalSkills() {
        String sql = """
                select BASIC_PRACTICAL_SKILLS, count(*) as count from EMPLOYER_ASSESSMENT group by "BASIC_PRACTICAL_SKILLS"
                """;

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getWrittenAndOralLiteracy() {
        String sql = """
                select WRITTEN_AND_ORAL_LITERACY, count(*) as count from EMPLOYER_ASSESSMENT group by "WRITTEN_AND_ORAL_LITERACY"
                """;

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getAbilityToAcquireNewKnowledge() {
        String sql = """
                select ABILITY_TO_ACQUIRE_NEW_KNOWLEDGE, count(*) as count from EMPLOYER_ASSESSMENT group by "ABILITY_TO_ACQUIRE_NEW_KNOWLEDGE"
                """;

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getStudentAbilities() {
        String sql = """
                select STUDENT_ABILITIES, count(*) as count from EMPLOYER_ASSESSMENT group by "STUDENT_ABILITIES"
                """;

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getCreativity() {
        String sql = """
                select CREATIVITY, count(*) as count from EMPLOYER_ASSESSMENT group by "CREATIVITY"
                """;

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getImportanceForeignLanguages() {
        String sql = """
                select IMPORTANCE_FOREIGN_LANGUAGES, count(*) as count from EMPLOYER_ASSESSMENT group by "IMPORTANCE_FOREIGN_LANGUAGES"
                """;

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getNeedForInterpersonalSkills() {
        String sql = """
                select NEED_FOR_INTERPERSONAL_SKILLS, count(*) as count from EMPLOYER_ASSESSMENT group by "NEED_FOR_INTERPERSONAL_SKILLS"
                """;

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getWorkSkills() {
        String sql = """
                select WORK_SKILLS, count(*) as count from EMPLOYER_ASSESSMENT group by "WORK_SKILLS"
                """;

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getTeamworkSkills() {
        String sql = """
                select TEAMWORK_SKILLS, count(*) as count from EMPLOYER_ASSESSMENT group by "TEAMWORK_SKILLS"
                """;

        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> getIndependentWorkSkills() {
        String sql = """
                select INDEPENDENT_WORKSKILLS, count(*) as count from EMPLOYER_ASSESSMENT group by "INDEPENDENT_WORKSKILLS"
                """;

        return jdbcTemplate.queryForList(sql);
    }
}
