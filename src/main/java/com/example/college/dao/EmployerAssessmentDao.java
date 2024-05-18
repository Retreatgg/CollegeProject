package com.example.college.dao;

import com.example.college.model.EmployerAssessment;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
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


    public Long countPassing() {
        String sql = """
                select max(id) from EMPLOYER_ASSESSMENT
                """;

        return jdbcTemplate.queryForObject(sql, Long.class);
    }

    public List<String> getStaticColumn(String columnName) {
        String sql = "SELECT " + columnName + " FROM EMPLOYER_ASSESSMENT";

        return jdbcTemplate.queryForList(sql, String.class);
    }

    public List<Map<String, Object>> getStaticsWithCount(String columnName) {
        String totalCountQuery = "SELECT COUNT(*) FROM EMPLOYER_ASSESSMENT";
        int totalCount = jdbcTemplate.queryForObject(totalCountQuery, Integer.class);

        String sql = "SELECT " + columnName + ", (COUNT(*) * 100 / ?) AS percentage " +
                "FROM EMPLOYER_ASSESSMENT " +
                "GROUP BY " + columnName;

        return jdbcTemplate.query(sql, new Object[]{totalCount}, (rs, rowNum) -> {
            Map<String, Object> resultMap = new HashMap<>();
            resultMap.put(columnName, rs.getString(columnName));
            resultMap.put("percentage", rs.getDouble("percentage"));
            return resultMap;
        });

    }
}
