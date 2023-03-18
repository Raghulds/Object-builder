import com.student.constants;

import java.math.BigInteger;

public class Student {
    private String name;
    private Integer age;
    private String school;
    private String email;
    private BigInteger id;

    public static Builder getBuilder() {
        return new Builder();
    }
    private Student(Builder builder) {
      this.name = builder.getName();
      this.age = builder.getAge();
      this.school = builder.getSchool();
      this.email = builder.getEmail();
      this.id = builder.getId();
    }

    public static class Builder {
        private String name;
        private Integer age;
        private String school;
        private String email;
        private BigInteger id;

        public BigInteger getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public String getSchool() {
            return school;
        }

        public String getEmail() {
            return email;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder setSchool(String school) {
            this.school = school;
            return this;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setId(BigInteger id) {
            this.id = id;
        }

        public Student build() throws IllegalAccessException {
//            if(this.school != constants.school) {
//                throw new IllegalAccessException(
//                        new StringBuilder()
//                                .append("Students allowed only from ")
//                                .append(constants.school).toString());
//            }
            return new Student(this);
        }
    }

}
