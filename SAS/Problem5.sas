*PROBLEM 5;
data _null_;
    n = 20;

    divisible = 'False';
    x = n - 1;
    do while (divisible = 'False');
        x = x + 1;
        divisible = 'True';
        do i=2 to n;
            if mod(x,i) ne 0 then do;
                divisible = 'False';
                leave;
            end;
        end;
    end;
    put x=;
run;