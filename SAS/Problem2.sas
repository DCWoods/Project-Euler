*PROBLEM 2;
*Progress through the sequence, adding the even terms to a total;
data _null_;
    limit = 4000000;
    total = 0;
    x1 = 0;
    x = 1;
    do while (x <= limit);
        *Add current term, if it is even;
        if mod(x,2) = 0 then total = total + x;
 
        *Find next term;
        oldx1 = x1;
        x1 = x;
        x = oldx1 + x;
    end;
    put total=;
run;