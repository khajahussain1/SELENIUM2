package sql_interview_quesions;

import org.testng.annotations.Test;

public class Create_table_using_existing_table 
{
	@Test
	public void create_a_table_using_existing_table() {
	/*CREATE table WITH SELECT

	We can create a table using existing table [along with data].

	Syntax:
	    Create table <new_table_name> [col1, col2, col3 ... coln] as select * from 
	                                                               <old_table_name>;

	Ex:
	    SQL> create table student1 as select * from student;
	    
	    Creating table with your own column names.
	    SQL> create table student2(sno, sname, smarks) as select * from student;
	    
	    Creating table with specified columns.
	    SQL> create table student3 as select no,name from student;
	 
	    Creating table without table data.
	    SQL> create table student2(sno, sname, smarks) as select * from student where 1 = 2;
	    In the above where clause give any condition which does not satisfy.
*/
}

     @Test
     public void insert_existing_table_data_to_a_another_table_in_a_single_trip() {
    	 /*INSERT WITH SELECT

    	 Using this we can insert existing table data to a another table in a single trip. But the table structure should be same.

    	 Syntax:
    	      Insert into <table1> select * from <table2>;    

    	 Ex:
    	      SQL> insert into student1 select * from student;

    	      Inserting data into specified columns
    	      SQL> insert into student1(no, name) select no, name from student;*/

     }
     
     @Test
     public void COLUMN_ALIASES_and_TABLE_ALIASES() {
    	 
    	 /*COLUMN ALIASES

    	 Syntax:
    	      Select <orginal_col> <alias_name> from <table_name>;

    	 Ex:
    	      SQL> select no sno from student;
    	 or
    	      SQL> select no “sno” from student;

    	 TABLE ALIASES

    	 If you are using table aliases you can use dot method to the columns.

    	 Syntax:
    	      Select <alias_name>.<col1>, <alias_name>.<col2> … <alias_name>.<coln> from <table_name> <alias_name>;

    	 Ex:
    	      SQL> select s.no, s.name from student s;
*/
     }
     
     @Test
     public void merge_command_to_perform_insert_and_update_in_a_single_command() {
    	
    	 /*MERGE

    	 You can use merge command to perform insert and update in a single command.

    	 Ex:

    	 SQL> Merge into student1 s1 Using (select *From student2) s2 On(s1.no=s2.no) When matched then 
    	      Update set marks = s2.marks When not matched then Insert (s1.no,s1.name,s1.marks) Values(s2.no,s2.name,s2.marks);

    	 In the above the two tables are with the same structure but we can merge different structured     
    	 tables also but the data type of the columns should match.

    	 Assume that student1 has columns like no,name,marks and student2 has columns like no,       
    	 name, hno, city.

    	 SQL> Merge into student1 s1 Using (select *From student2) s2 On(s1.no=s2.no) When matched then
    	         Update set marks = s2.hno When not matched then Insert (s1.no,s1.name,s1.marks) Values(s2.no,s2.name,s2.hno);
*/
     }
     

}
