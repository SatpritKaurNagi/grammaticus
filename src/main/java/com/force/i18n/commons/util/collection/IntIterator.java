/* 
 * Copyright (c) 2017, salesforce.com, inc.
 * All rights reserved.
 * Licensed under the BSD 3-Clause license. 
 * For full license text, see LICENSE.txt file in the repo root  or https://opensource.org/licenses/BSD-3-Clause
 */

package com.force.i18n.commons.util.collection;

import com.google.common.annotations.Beta;

/**
 * An iterator over a collection of ints.  
 *
 * Beta class. Classes under com.force.i18n.commons package will be moved into a dedicated project.
 *
 * @author  Based on Sun's java.util.Iterator (modified by koliver)
 * @see java.util.Iterator
 */
@Beta
public interface IntIterator {
    /**
     * Returns <tt>true</tt> if the iteration has more elements. (In other
     * words, returns <tt>true</tt> if <tt>next</tt> would return an element
     * rather than throwing an exception.)
     *
     * @return <tt>true</tt> if the iterator has more elements.
     */
    boolean hasNext();

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration.
     * @exception NoSuchElementException iteration has no more elements.
     */
    int next();
    
    /*
    * IMPORTANT: this intentionally doesn't have the remove() operation because
    * it makes implementing an unmodifiable IntMap horrifically difficult (see
    * Collections.unmodifiableMap) and no one was using it. Don't add it.
    */
}
