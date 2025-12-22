using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _17_winform
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            Button btn = new Button();
            btn.Text = "Submit";
            this.Controls.Add(btn);
            btn.Click += new EventHandler(button1_Click);
            InitializeComponent();
            
        }

        private void button1_Click(object sender, EventArgs e)
        {
            MessageBox.Show("button is Clicked.");
        }
    }
}
