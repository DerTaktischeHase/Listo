/*******************************************************************************
 * Copyright © 2025 DerTaktischeHase. All rights reserved.
 * Any use only with prior written permission.
 * No liability for errors or omissions.
 ******************************************************************************/

package de.dertaktischehase.listo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

    }
}