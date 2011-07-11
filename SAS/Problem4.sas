*PROBLEM 4;
data _null_;
    largest = 0;
    do i= 100 to 999;
        do j=100 to 999;
            product = i * j;
            
            if product > largest then do;
                *Check if palindromic;
                str = put(product,32.0);
                rev = reverse(strip(str));
                if strip(str) = strip(rev) then largest = product;
            end;
        end;
    end;
    put largest=;
run;