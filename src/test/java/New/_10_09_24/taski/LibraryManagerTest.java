package New._10_09_24.taski;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

//@ExtendWith(MockitoExtension.class)
//class LibraryManagerTest {
//    @Mock
//    BookRepository bookRepository;
//    @InjectMocks
//    LibraryManager libraryManager = new LibraryManager(bookRepository);
//
//    private static final Book TEST_BOOK = new Book("001","New book","Au");
//    @Test
//    void lendBook() {
//        when(bookRepository.findById(anyString()))
//                .thenReturn(Optional.of(new Book("001","New book","Au")));
//        assertTrue(TEST_BOOK.isLent());
//        verify(bookRepository.findById(anyString()));
//        verify(bookRepository.save(TEST_BOOK));
//    }
//
//}