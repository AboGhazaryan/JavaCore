package Library.storage;

import Library.exception.AuthorNotFoundException;
import Library.model.Author;

public class AutorStorage {
    private Author[] authors = new Author[10];
    private int size = 0;

    public void add(Author author){
        if(size == authors.length){
            extend();
        }
        authors[size ++] = author;
    }

    private void extend() {
        Author[] temp = new Author[size + 10];
        System.arraycopy(authors, 0, temp, 0, size);
        authors = temp;
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(authors[i]);
        }
    }

    public Author getAuthorByPhoneNumber(String phoneNumber) throws AuthorNotFoundException {
        for (int i = 0; i < size; i++) {
            if(authors[i].getPhoneNumber().equals(phoneNumber)){
                return authors[i];
            }
        }
        throw new AuthorNotFoundException("Author with " + phoneNumber + " does not exists!" );
    }




}
