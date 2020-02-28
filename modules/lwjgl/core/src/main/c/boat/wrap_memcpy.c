#include <stddef.h>
#include <sring.h>

void *__wrap_memcpy(void *dest, const void *src, size_t n) {
    return memcpy(dest, src, n);
}
