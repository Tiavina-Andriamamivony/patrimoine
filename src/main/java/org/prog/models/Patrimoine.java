package org.prog.models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public  class  Patrimoine {
    private List<Possession> possessions;

}
