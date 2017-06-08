package questions

class Question {
    Date dateCreated
    String content
    String author
    Integer points

    static constraints = {
        content nullable: false, blank: false
        author nullable: true
        points nullable: true, min: 0
    }
}
