/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.deluxebooking;
import com.mycompany.deluxebooking.SeatReservation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author joshu
 */
    public class SearchFlight extends javax.swing.JFrame {
    private final List<Flight> flights = new ArrayList<>();
    public static Map<String, Integer> seatAvailabilityMap = new HashMap<>();
        
    /**
     * Creates new form SearchFlight
     */
    public SearchFlight() {
        setTitle("Search Flight");
        populateFlights();
        initComponents();
    }
    
    private void populateFlights() {
        flights.add(new Flight("Cebu Milker Airline", "AA101", "Tokyo, Japan", "Fukuoka, Japan", "12:00 AM", "3:00 AM", "₱3,300"));
        flights.add(new Flight("Mathilda Airline", "AAMON012", "Osaka, Japan", "Sapporo, Japan", "1:00 AM", "4:00 AM", "₱2,4350"));
        flights.add(new Flight("Mathilda Airline", "AAMON012", "Tokyo, Japan", "Fukuoka, Japan", "12:00 AM", "4:40 AM", "₱3,700"));
        flights.add(new Flight("Mathilda Airline", "AAMON012", "Tokyo, Japan", "Fukuoka, Japan", "12:00 AM", "6:30 AM", "₱3,700"));
        flights.add(new Flight("Mathilda Airline", "AAMON012", "Osaka, Japan", "Sapporo, Japan", "1:00 AM", "4:00 AM", "₱7,750"));
        flights.add(new Flight("Mathilda Airline", "AAMON012", "Tokyo, Japan", "Fukuoka, Japan", "2:00 AM", "5:00 AM", "₱8,780"));
        flights.add(new Flight("Aamon Airline", "AA001", "Tokyo, Japan", "Kyoto, Japan", "6:00 AM", "8:30 AM", "₱4,200"));
        flights.add(new Flight("Aamon Airline", "AA002", "Osaka, Japan", "Sapporo, Japan", "7:00 AM", "10:00 AM", "₱5,300"));
        flights.add(new Flight("Benedetta Airways", "BA101", "Fukuoka, Japan", "Nagoya, Japan", "5:00 PM", "7:45 PM", "₱3,900"));
        flights.add(new Flight("Benedetta Airways", "BA102", "Hiroshima, Japan", "Nara, Japan", "9:00 AM", "11:30 AM", "₱2,800"));
        flights.add(new Flight("Claude Aviation", "CA301", "Seoul, South Korea", "Busan, South Korea", "1:30 PM", "3:00 PM", "₱4,000"));
        flights.add(new Flight("Claude Aviation", "CA302", "Jeju City, South Korea", "Incheon, South Korea", "2:15 PM", "4:45 PM", "₱4,500"));
        flights.add(new Flight("Esmeralda Airlines", "EA401", "Bangkok, Thailand", "Phuket, Thailand", "6:00 AM", "8:00 AM", "₱3,600"));
        flights.add(new Flight("Esmeralda Airlines", "EA402", "Chiang Mai, Thailand", "Krabi, Thailand", "10:00 AM", "1:30 PM", "₱4,200"));
        flights.add(new Flight("Freya Airways", "FA501", "Manila, Philippines", "Cebu, Philippines", "7:30 AM", "9:15 AM", "₱2,900"));
        flights.add(new Flight("Freya Airways", "FA502", "Boracay, Philippines", "Davao, Philippines", "8:45 AM", "11:20 AM", "₱3,500"));
        flights.add(new Flight("Gusion Jet", "GJ601", "Bali, Indonesia", "Jakarta, Indonesia", "6:30 PM", "8:15 PM", "₱4,800"));
        flights.add(new Flight("Gusion Jet", "GJ602", "Yogyakarta, Indonesia", "Surabaya, Indonesia", "5:00 AM", "6:40 AM", "₱3,200"));
        flights.add(new Flight("Harith Airlines", "HA701", "Hanoi, Vietnam", "Ho Chi Minh City, Vietnam", "11:00 AM", "1:30 PM", "₱4,400"));
        flights.add(new Flight("Harith Airlines", "HA702", "Da Nang, Vietnam", "Nha Trang, Vietnam", "4:00 PM", "6:20 PM", "₱3,700"));
        flights.add(new Flight("Irithel Aviation", "IA801", "New Delhi, India", "Mumbai, India", "9:15 AM", "11:45 AM", "₱5,200"));
        flights.add(new Flight("Irithel Aviation", "IA802", "Jaipur, India", "Agra, India", "12:30 PM", "2:00 PM", "₱3,800"));
        flights.add(new Flight("Jawhead Airlines", "JA901", "Beijing, China", "Shanghai, China", "6:00 AM", "8:40 AM", "₱6,000"));
        flights.add(new Flight("Jawhead Airlines", "JA902", "Hong Kong, China", "Macau, China", "10:00 AM", "11:20 AM", "₱3,900"));
        flights.add(new Flight("Kagura Air", "KA1001", "Taipei, Taiwan", "Kaohsiung, Taiwan", "7:45 AM", "9:15 AM", "₱4,100"));
        flights.add(new Flight("Kagura Air", "KA1002", "Tainan, Taiwan", "Taichung, Taiwan", "3:00 PM", "4:45 PM", "₱3,600"));
        flights.add(new Flight("Lancelot Airways", "LA1101", "Singapore, Singapore", "Kuala Lumpur, Malaysia", "5:45 AM", "7:10 AM", "₱5,500"));
        flights.add(new Flight("Lancelot Airways", "LA1102", "Penang, Malaysia", "Langkawi, Malaysia", "2:30 PM", "4:00 PM", "₱4,300"));
        flights.add(new Flight("Moskov Jet", "MJ1201", "Phnom Penh, Cambodia", "Siem Reap, Cambodia", "10:15 AM", "12:30 PM", "₱3,700"));
        flights.add(new Flight("Moskov Jet", "MJ1202", "Sihanoukville, Cambodia", "Battambang, Cambodia", "5:00 PM", "7:10 PM", "₱4,600"));
        flights.add(new Flight("Nana Airlines", "NA1301", "Vientiane, Laos", "Luang Prabang, Laos", "6:20 AM", "8:00 AM", "₱3,500"));
        flights.add(new Flight("Nana Airlines", "NA1302", "Pakse, Laos", "Yangon, Myanmar", "4:30 PM", "6:50 PM", "₱4,700"));
        flights.add(new Flight("Odette Airways", "OA1401", "Dhaka, Bangladesh", "Thimphu, Bhutan", "12:00 PM", "2:30 PM", "₱5,200"));
        flights.add(new Flight("Odette Airways", "OA1402", "Paro, Bhutan", "Punakha, Bhutan", "7:00 AM", "8:30 AM", "₱3,400"));
        flights.add(new Flight("Pharsa Jet", "PJ1501", "Malé, Maldives", "Colombo, Sri Lanka", "3:30 PM", "6:00 PM", "₱6,100"));
        flights.add(new Flight("Pharsa Jet", "PJ1502", "Kandy, Sri Lanka", "Galle, Sri Lanka", "5:15 AM", "7:45 AM", "₱3,900"));
        flights.add(new Flight("Aamon Airline", "AA003", "Tokyo, Japan", "Kyoto, Japan", "1:00 AM", "3:30 AM", "₱4,500"));
        flights.add(new Flight("Benedetta Airways", "BA103", "Tokyo, Japan", "Kyoto, Japan", "1:00 AM", "3:45 AM", "₱4,700"));
        flights.add(new Flight("Claude Aviation", "CA303", "Tokyo, Japan", "Kyoto, Japan", "1:00 AM", "3:20 AM", "₱4,200"));
        flights.add(new Flight("Esmeralda Airlines", "EA403", "Tokyo, Japan", "Kyoto, Japan", "1:00 AM", "3:50 AM", "₱4,800"));
        flights.add(new Flight("Freya Airways", "FA503", "Tokyo, Japan", "Kyoto, Japan", "1:00 AM", "3:40 AM", "₱4,600"));
        flights.add(new Flight("Freya Airways", "FA502", "Boracay, Philippines", "Davao, Philippines", "8:45 AM", "11:20 AM", "₱3,500"));
        flights.add(new Flight("Aamon Airline", "AA101", "Tokyo, Japan", "Fukuoka, Japan", "12:00 AM", "3:00 AM", "₱3,300"));
        
        for (Flight flight : flights) {
            seatAvailabilityMap.put(flight.getFlightNumber(), 25); 
        }
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        availableTextLabel = new javax.swing.JLabel();
        flightLabel = new javax.swing.JLabel();
        fromTextLabel = new javax.swing.JLabel();
        placeFromComboBox = new javax.swing.JComboBox<>();
        placeToComboBox = new javax.swing.JComboBox<>();
        toTextLabel = new javax.swing.JLabel();
        timeComboBox = new javax.swing.JComboBox<>();
        timeTextLabel = new javax.swing.JLabel();
        dateTextLabel = new javax.swing.JLabel();
        headerTextLabel = new javax.swing.JLabel();
        searchFlightButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        flightListTable = new javax.swing.JTable();
        continueBtn = new javax.swing.JButton();
        dateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgPanel.setBackground(new java.awt.Color(254, 254, 254));
        bgPanel.setPreferredSize(new java.awt.Dimension(930, 600));

        availableTextLabel.setFont(new java.awt.Font("Inter 28pt", 1, 31)); // NOI18N
        availableTextLabel.setText("Available Flights");

        flightLabel.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 14)); // NOI18N
        flightLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        flightLabel.setText("Flight");

        fromTextLabel.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 14)); // NOI18N
        fromTextLabel.setForeground(new java.awt.Color(204, 204, 204));
        fromTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fromTextLabel.setText("From");

        placeFromComboBox.setFont(new java.awt.Font("Inter 18pt Medium", 0, 12)); // NOI18N
        placeFromComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tokyo, Japan  ", "Kyoto, Japan  ", "Osaka, Japan  ", "Sapporo, Japan  ", "Fukuoka, Japan  ", "Nagoya, Japan  ", "Hiroshima, Japan  ", "Nara, Japan  ", "Kobe, Japan  ", "Yokohama, Japan  ", "Sendai, Japan  ", "Hakone, Japan  ", "Nagasaki, Japan  ", "Kanazawa, Japan  ", "Takayama, Japan  ", "Seoul, South Korea  ", "Busan, South Korea  ", "Jeju City, South Korea  ", "Incheon, South Korea  ", "Daegu, South Korea  ", "Gwangju, South Korea  ", "Suwon, South Korea  ", "Ulsan, South Korea  ", "Daejeon, South Korea  ", "Chuncheon, South Korea  ", "Bangkok, Thailand  ", "Phuket, Thailand  ", "Chiang Mai, Thailand  ", "Krabi, Thailand  ", "Pattaya, Thailand  ", "Koh Samui, Thailand  ", "Ayutthaya, Thailand  ", "Koh Phi Phi, Thailand  ", "Hua Hin, Thailand  ", "Sukhothai, Thailand  ", "Manila, Philippines  ", "Cebu, Philippines  ", "Boracay, Philippines  ", "Davao, Philippines  ", "Bohol, Philippines  ", "Baguio, Philippines  ", "Siargao, Philippines  ", "Palawan, Philippines  ", "Vigan, Philippines  ", "Batanes, Philippines  ", "Bali, Indonesia  ", "Jakarta, Indonesia  ", "Yogyakarta, Indonesia  ", "Lombok, Indonesia  ", "Surabaya, Indonesia  ", "Komodo Island, Indonesia  ", "Bandung, Indonesia  ", "Ubud, Indonesia  ", "Makassar, Indonesia  ", "Manado, Indonesia  ", "Hanoi, Vietnam  ", "Ho Chi Minh City, Vietnam  ", "Da Nang, Vietnam  ", "Hue, Vietnam  ", "Nha Trang, Vietnam  ", "Ha Long Bay, Vietnam  ", "Sapa, Vietnam  ", "Phu Quoc, Vietnam  ", "Hoi An, Vietnam  ", "Vung Tau, Vietnam  ", "New Delhi, India  ", "Mumbai, India  ", "Jaipur, India  ", "Agra, India  ", "Goa, India  ", "Varanasi, India  ", "Bangalore, India  ", "Chennai, India  ", "Kolkata, India  ", "Hyderabad, India  ", "Udaipur, India  ", "Pune, India  ", "Darjeeling, India  ", "Shimla, India  ", "Rishikesh, India  ", "Beijing, China  ", "Shanghai, China  ", "Guilin, China  ", "Chengdu, China  ", "Hong Kong, China  ", "Macau, China  ", "Xian, China  ", "Lhasa, Tibet  ", "Kunming, China  ", "Hangzhou, China  ", "Suzhou, China  ", "Nanjing, China  ", "Harbin, China  ", "Shenzhen, China  ", "Zhangjiajie, China  ", "Taipei, Taiwan  ", "Kaohsiung, Taiwan  ", "Taichung, Taiwan  ", "Tainan, Taiwan  ", "Alishan, Taiwan  ", "Sun Moon Lake, Taiwan  ", "Kenting, Taiwan  ", "Hualien, Taiwan  ", "Singapore, Singapore  ", "Kuala Lumpur, Malaysia  ", "Penang, Malaysia  ", "Langkawi, Malaysia  ", "Kota Kinabalu, Malaysia  ", "Malacca, Malaysia  ", "Cameron Highlands, Malaysia  ", "Ipoh, Malaysia  ", "Phnom Penh, Cambodia  ", "Siem Reap, Cambodia  ", "Sihanoukville, Cambodia  ", "Battambang, Cambodia  ", "Kampot, Cambodia  ", "Vientiane, Laos  ", "Luang Prabang, Laos  ", "Pakse, Laos  ", "Yangon, Myanmar  ", "Mandalay, Myanmar  ", "Bagan, Myanmar  ", "Naypyidaw, Myanmar  ", "Dhaka, Bangladesh  ", "Thimphu, Bhutan  ", "Paro, Bhutan  ", "Punakha, Bhutan  ", "Malé, Maldives  ", "Colombo, Sri Lanka  ", "Kandy, Sri Lanka  ", "Galle, Sri Lanka  ", "Ella, Sri Lanka  ", "Sigiriya, Sri Lanka  ", "Paris, France  ", "Nice, France  ", "Bordeaux, France  ", "Marseille, France  ", "Lyon, France  ", "Toulouse, France  ", "Strasbourg, France  ", "Mont Saint-Michel, France  ", "Normandy, France  ", "Cannes, France  ", "Monaco  ", "Rome, Italy  ", "Venice, Italy  ", "Florence, Italy  ", "Milan, Italy  ", "Naples, Italy  ", "Verona, Italy  ", "Cinque Terre, Italy  ", "Sicily, Italy  ", "Sardinia, Italy  ", "Bologna, Italy  ", "London, United Kingdom  ", "Edinburgh, United Kingdom  ", "Manchester, United Kingdom  ", "Dublin, Ireland  ", "Cork, Ireland  ", "Galway, Ireland  ", "Belfast, Northern Ireland  ", "Berlin, Germany  ", "Munich, Germany  ", "Frankfurt, Germany  ", "Hamburg, Germany  ", "Cologne, Germany  ", "Dusseldorf, Germany  ", "Leipzig, Germany  ", "Barcelona, Spain  ", "Madrid, Spain  ", "Seville, Spain  ", "Valencia, Spain  ", "Granada, Spain  ", "Bilbao, Spain  ", "Santiago de Compostela, Spain  ", "Lisbon, Portugal  ", "Porto, Portugal  ", "Madeira, Portugal  ", "The Azores, Portugal  ", "Athens, Greece  ", "Santorini, Greece  ", "Mykonos, Greece  ", "Crete, Greece  ", "Rhodes, Greece  ", "Vienna, Austria  ", "Salzburg, Austria  ", "Hallstatt, Austria  ", "Prague, Czech Republic  ", "Budapest, Hungary  ", "Warsaw, Poland  ", "Krakow, Poland  ", "Gdansk, Poland  ", "Zurich, Switzerland  ", "Lucerne, Switzerland  ", "Geneva, Switzerland  ", "Interlaken, Switzerland  ", "Brussels, Belgium  ", "Bruges, Belgium  ", "Amsterdam, Netherlands  ", "Rotterdam, Netherlands  ", "Copenhagen, Denmark  ", "Stockholm, Sweden  ", "Oslo, Norway  ", "Bergen, Norway  ", "Helsinki, Finland  ", "Reykjavik, Iceland  ", "Istanbul, Turkey  ", "Antalya, Turkey  ", "Cappadocia, Turkey  ", "Dubrovnik, Croatia  ", "Zagreb, Croatia  ", "Split, Croatia  ", "Belgrade, Serbia  ", "Kotor, Montenegro  ", "Sofia, Bulgaria  ", "Transylvania, Romania  ", "Ljubljana, Slovenia  ", "Tbilisi, Georgia  ", "Baku, Azerbaijan  ", "Almaty, Kazakhstan  ", "Moscow, Russia  ", "Saint Petersburg, Russia  ", "Yerevan, Armenia  ", "Tashkent, Uzbekistan  ", "Samarkand, Uzbekistan  ", "Dushanbe, Tajikistan  ", "Jerusalem, Israel  ", "Dubai, UAE  ", "Abu Dhabi, UAE  ", "Doha, Qatar  ", "Muscat, Oman  ", "Petra, Jordan  ", "Cape Town, South Africa  ", "Johannesburg, South Africa  ", "Kruger National Park, South Africa  ", "Marrakech, Morocco  ", "Casablanca, Morocco  ", "Cairo, Egypt  ", "Alexandria, Egypt  ", "Giza, Egypt" }));
        placeFromComboBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        placeFromComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeFromComboBoxActionPerformed(evt);
            }
        });

        placeToComboBox.setFont(new java.awt.Font("Inter 18pt Medium", 0, 12)); // NOI18N
        placeToComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tokyo, Japan  ", "Kyoto, Japan  ", "Osaka, Japan  ", "Sapporo, Japan  ", "Fukuoka, Japan  ", "Nagoya, Japan  ", "Hiroshima, Japan  ", "Nara, Japan  ", "Kobe, Japan  ", "Yokohama, Japan  ", "Sendai, Japan  ", "Hakone, Japan  ", "Nagasaki, Japan  ", "Kanazawa, Japan  ", "Takayama, Japan  ", "Seoul, South Korea  ", "Busan, South Korea  ", "Jeju City, South Korea  ", "Incheon, South Korea  ", "Daegu, South Korea  ", "Gwangju, South Korea  ", "Suwon, South Korea  ", "Ulsan, South Korea  ", "Daejeon, South Korea  ", "Chuncheon, South Korea  ", "Bangkok, Thailand  ", "Phuket, Thailand  ", "Chiang Mai, Thailand  ", "Krabi, Thailand  ", "Pattaya, Thailand  ", "Koh Samui, Thailand  ", "Ayutthaya, Thailand  ", "Koh Phi Phi, Thailand  ", "Hua Hin, Thailand  ", "Sukhothai, Thailand  ", "Manila, Philippines  ", "Cebu, Philippines  ", "Boracay, Philippines  ", "Davao, Philippines  ", "Bohol, Philippines  ", "Baguio, Philippines  ", "Siargao, Philippines  ", "Palawan, Philippines  ", "Vigan, Philippines  ", "Batanes, Philippines  ", "Bali, Indonesia  ", "Jakarta, Indonesia  ", "Yogyakarta, Indonesia  ", "Lombok, Indonesia  ", "Surabaya, Indonesia  ", "Komodo Island, Indonesia  ", "Bandung, Indonesia  ", "Ubud, Indonesia  ", "Makassar, Indonesia  ", "Manado, Indonesia  ", "Hanoi, Vietnam  ", "Ho Chi Minh City, Vietnam  ", "Da Nang, Vietnam  ", "Hue, Vietnam  ", "Nha Trang, Vietnam  ", "Ha Long Bay, Vietnam  ", "Sapa, Vietnam  ", "Phu Quoc, Vietnam  ", "Hoi An, Vietnam  ", "Vung Tau, Vietnam  ", "New Delhi, India  ", "Mumbai, India  ", "Jaipur, India  ", "Agra, India  ", "Goa, India  ", "Varanasi, India  ", "Bangalore, India  ", "Chennai, India  ", "Kolkata, India  ", "Hyderabad, India  ", "Udaipur, India  ", "Pune, India  ", "Darjeeling, India  ", "Shimla, India  ", "Rishikesh, India  ", "Beijing, China  ", "Shanghai, China  ", "Guilin, China  ", "Chengdu, China  ", "Hong Kong, China  ", "Macau, China  ", "Xian, China  ", "Lhasa, Tibet  ", "Kunming, China  ", "Hangzhou, China  ", "Suzhou, China  ", "Nanjing, China  ", "Harbin, China  ", "Shenzhen, China  ", "Zhangjiajie, China  ", "Taipei, Taiwan  ", "Kaohsiung, Taiwan  ", "Taichung, Taiwan  ", "Tainan, Taiwan  ", "Alishan, Taiwan  ", "Sun Moon Lake, Taiwan  ", "Kenting, Taiwan  ", "Hualien, Taiwan  ", "Singapore, Singapore  ", "Kuala Lumpur, Malaysia  ", "Penang, Malaysia  ", "Langkawi, Malaysia  ", "Kota Kinabalu, Malaysia  ", "Malacca, Malaysia  ", "Cameron Highlands, Malaysia  ", "Ipoh, Malaysia  ", "Phnom Penh, Cambodia  ", "Siem Reap, Cambodia  ", "Sihanoukville, Cambodia  ", "Battambang, Cambodia  ", "Kampot, Cambodia  ", "Vientiane, Laos  ", "Luang Prabang, Laos  ", "Pakse, Laos  ", "Yangon, Myanmar  ", "Mandalay, Myanmar  ", "Bagan, Myanmar  ", "Naypyidaw, Myanmar  ", "Dhaka, Bangladesh  ", "Thimphu, Bhutan  ", "Paro, Bhutan  ", "Punakha, Bhutan  ", "Malé, Maldives  ", "Colombo, Sri Lanka  ", "Kandy, Sri Lanka  ", "Galle, Sri Lanka  ", "Ella, Sri Lanka  ", "Sigiriya, Sri Lanka  ", "Paris, France  ", "Nice, France  ", "Bordeaux, France  ", "Marseille, France  ", "Lyon, France  ", "Toulouse, France  ", "Strasbourg, France  ", "Mont Saint-Michel, France  ", "Normandy, France  ", "Cannes, France  ", "Monaco  ", "Rome, Italy  ", "Venice, Italy  ", "Florence, Italy  ", "Milan, Italy  ", "Naples, Italy  ", "Verona, Italy  ", "Cinque Terre, Italy  ", "Sicily, Italy  ", "Sardinia, Italy  ", "Bologna, Italy  ", "London, United Kingdom  ", "Edinburgh, United Kingdom  ", "Manchester, United Kingdom  ", "Dublin, Ireland  ", "Cork, Ireland  ", "Galway, Ireland  ", "Belfast, Northern Ireland  ", "Berlin, Germany  ", "Munich, Germany  ", "Frankfurt, Germany  ", "Hamburg, Germany  ", "Cologne, Germany  ", "Dusseldorf, Germany  ", "Leipzig, Germany  ", "Barcelona, Spain  ", "Madrid, Spain  ", "Seville, Spain  ", "Valencia, Spain  ", "Granada, Spain  ", "Bilbao, Spain  ", "Santiago de Compostela, Spain  ", "Lisbon, Portugal  ", "Porto, Portugal  ", "Madeira, Portugal  ", "The Azores, Portugal  ", "Athens, Greece  ", "Santorini, Greece  ", "Mykonos, Greece  ", "Crete, Greece  ", "Rhodes, Greece  ", "Vienna, Austria  ", "Salzburg, Austria  ", "Hallstatt, Austria  ", "Prague, Czech Republic  ", "Budapest, Hungary  ", "Warsaw, Poland  ", "Krakow, Poland  ", "Gdansk, Poland  ", "Zurich, Switzerland  ", "Lucerne, Switzerland  ", "Geneva, Switzerland  ", "Interlaken, Switzerland  ", "Brussels, Belgium  ", "Bruges, Belgium  ", "Amsterdam, Netherlands  ", "Rotterdam, Netherlands  ", "Copenhagen, Denmark  ", "Stockholm, Sweden  ", "Oslo, Norway  ", "Bergen, Norway  ", "Helsinki, Finland  ", "Reykjavik, Iceland  ", "Istanbul, Turkey  ", "Antalya, Turkey  ", "Cappadocia, Turkey  ", "Dubrovnik, Croatia  ", "Zagreb, Croatia  ", "Split, Croatia  ", "Belgrade, Serbia  ", "Kotor, Montenegro  ", "Sofia, Bulgaria  ", "Transylvania, Romania  ", "Ljubljana, Slovenia  ", "Tbilisi, Georgia  ", "Baku, Azerbaijan  ", "Almaty, Kazakhstan  ", "Moscow, Russia  ", "Saint Petersburg, Russia  ", "Yerevan, Armenia  ", "Tashkent, Uzbekistan  ", "Samarkand, Uzbekistan  ", "Dushanbe, Tajikistan  ", "Jerusalem, Israel  ", "Dubai, UAE  ", "Abu Dhabi, UAE  ", "Doha, Qatar  ", "Muscat, Oman  ", "Petra, Jordan  ", "Cape Town, South Africa  ", "Johannesburg, South Africa  ", "Kruger National Park, South Africa  ", "Marrakech, Morocco  ", "Casablanca, Morocco  ", "Cairo, Egypt  ", "Alexandria, Egypt  ", "Giza, Egypt" }));
        placeToComboBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        placeToComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeToComboBoxActionPerformed(evt);
            }
        });

        toTextLabel.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 14)); // NOI18N
        toTextLabel.setForeground(new java.awt.Color(204, 204, 204));
        toTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        toTextLabel.setText("To");

        timeComboBox.setFont(new java.awt.Font("Inter 18pt Medium", 0, 12)); // NOI18N
        timeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12:00 AM", "12:01 AM", "12:02 AM", "12:03 AM", "12:04 AM", "12:05 AM", "12:06 AM", "12:07 AM", "12:08 AM", "12:09 AM", "12:10 AM", "12:11 AM", "12:12 AM", "12:13 AM", "12:14 AM", "12:15 AM", "12:16 AM", "12:17 AM", "12:18 AM", "12:19 AM", "12:20 AM", "12:21 AM", "12:22 AM", "12:23 AM", "12:24 AM", "12:25 AM", "12:26 AM", "12:27 AM", "12:28 AM", "12:29 AM", "12:30 AM", "12:31 AM", "12:32 AM", "12:33 AM", "12:34 AM", "12:35 AM", "12:36 AM", "12:37 AM", "12:38 AM", "12:39 AM", "12:40 AM", "12:41 AM", "12:42 AM", "12:43 AM", "12:44 AM", "12:45 AM", "12:46 AM", "12:47 AM", "12:48 AM", "12:49 AM", "12:50 AM", "12:51 AM", "12:52 AM", "12:53 AM", "12:54 AM", "12:55 AM", "12:56 AM", "12:57 AM", "12:58 AM", "12:59 AM", "1:00 AM", "1:01 AM", "1:02 AM", "1:03 AM", "1:04 AM", "1:05 AM", "1:06 AM", "1:07 AM", "1:08 AM", "1:09 AM", "1:10 AM", "1:11 AM", "1:12 AM", "1:13 AM", "1:14 AM", "1:15 AM", "1:16 AM", "1:17 AM", "1:18 AM", "1:19 AM", "1:20 AM", "1:21 AM", "1:22 AM", "1:23 AM", "1:24 AM", "1:25 AM", "1:26 AM", "1:27 AM", "1:28 AM", "1:29 AM", "1:30 AM", "1:31 AM", "1:32 AM", "1:33 AM", "1:34 AM", "1:35 AM", "1:36 AM", "1:37 AM", "1:38 AM", "1:39 AM", "1:40 AM", "1:41 AM", "1:42 AM", "1:43 AM", "1:44 AM", "1:45 AM", "1:46 AM", "1:47 AM", "1:48 AM", "1:49 AM", "1:50 AM", "1:51 AM", "1:52 AM", "1:53 AM", "1:54 AM", "1:55 AM", "1:56 AM", "1:57 AM", "1:58 AM", "1:59 AM", "2:00 AM", "2:01 AM", "2:02 AM", "2:03 AM", "2:04 AM", "2:05 AM", "2:06 AM", "2:07 AM", "2:08 AM", "2:09 AM", "2:10 AM", "2:11 AM", "2:12 AM", "2:13 AM", "2:14 AM", "2:15 AM", "2:16 AM", "2:17 AM", "2:18 AM", "2:19 AM", "2:20 AM", "2:21 AM", "2:22 AM", "2:23 AM", "2:24 AM", "2:25 AM", "2:26 AM", "2:27 AM", "2:28 AM", "2:29 AM", "2:30 AM", "2:31 AM", "2:32 AM", "2:33 AM", "2:34 AM", "2:35 AM", "2:36 AM", "2:37 AM", "2:38 AM", "2:39 AM", "2:40 AM", "2:41 AM", "2:42 AM", "2:43 AM", "2:44 AM", "2:45 AM", "2:46 AM", "2:47 AM", "2:48 AM", "2:49 AM", "2:50 AM", "2:51 AM", "2:52 AM", "2:53 AM", "2:54 AM", "2:55 AM", "2:56 AM", "2:57 AM", "2:58 AM", "2:59 AM", "3:00 AM", "3:01 AM", "3:02 AM", "3:03 AM", "3:04 AM", "3:05 AM", "3:06 AM", "3:07 AM", "3:08 AM", "3:09 AM", "3:10 AM", "3:11 AM", "3:12 AM", "3:13 AM", "3:14 AM", "3:15 AM", "3:16 AM", "3:17 AM", "3:18 AM", "3:19 AM", "3:20 AM", "3:21 AM", "3:22 AM", "3:23 AM", "3:24 AM", "3:25 AM", "3:26 AM", "3:27 AM", "3:28 AM", "3:29 AM", "3:30 AM", "3:31 AM", "3:32 AM", "3:33 AM", "3:34 AM", "3:35 AM", "3:36 AM", "3:37 AM", "3:38 AM", "3:39 AM", "3:40 AM", "3:41 AM", "3:42 AM", "3:43 AM", "3:44 AM", "3:45 AM", "3:46 AM", "3:47 AM", "3:48 AM", "3:49 AM", "3:50 AM", "3:51 AM", "3:52 AM", "3:53 AM", "3:54 AM", "3:55 AM", "3:56 AM", "3:57 AM", "3:58 AM", "3:59 AM", "4:00 AM", "4:01 AM", "4:02 AM", "4:03 AM", "4:04 AM", "4:05 AM", "4:06 AM", "4:07 AM", "4:08 AM", "4:09 AM", "4:10 AM", "4:11 AM", "4:12 AM", "4:13 AM", "4:14 AM", "4:15 AM", "4:16 AM", "4:17 AM", "4:18 AM", "4:19 AM", "4:20 AM", "4:21 AM", "4:22 AM", "4:23 AM", "4:24 AM", "4:25 AM", "4:26 AM", "4:27 AM", "4:28 AM", "4:29 AM", "4:30 AM", "4:31 AM", "4:32 AM", "4:33 AM", "4:34 AM", "4:35 AM", "4:36 AM", "4:37 AM", "4:38 AM", "4:39 AM", "4:40 AM", "4:41 AM", "4:42 AM", "4:43 AM", "4:44 AM", "4:45 AM", "4:46 AM", "4:47 AM", "4:48 AM", "4:49 AM", "4:50 AM", "4:51 AM", "4:52 AM", "4:53 AM", "4:54 AM", "4:55 AM", "4:56 AM", "4:57 AM", "4:58 AM", "4:59 AM", "5:00 AM", "5:01 AM", "5:02 AM", "5:03 AM", "5:04 AM", "5:05 AM", "5:06 AM", "5:07 AM", "5:08 AM", "5:09 AM", "5:10 AM", "5:11 AM", "5:12 AM", "5:13 AM", "5:14 AM", "5:15 AM", "5:16 AM", "5:17 AM", "5:18 AM", "5:19 AM", "5:20 AM", "5:21 AM", "5:22 AM", "5:23 AM", "5:24 AM", "5:25 AM", "5:26 AM", "5:27 AM", "5:28 AM", "5:29 AM", "5:30 AM", "5:31 AM", "5:32 AM", "5:33 AM", "5:34 AM", "5:35 AM", "5:36 AM", "5:37 AM", "5:38 AM", "5:39 AM", "5:40 AM", "5:41 AM", "5:42 AM", "5:43 AM", "5:44 AM", "5:45 AM", "5:46 AM", "5:47 AM", "5:48 AM", "5:49 AM", "5:50 AM", "5:51 AM", "5:52 AM", "5:53 AM", "5:54 AM", "5:55 AM", "5:56 AM", "5:57 AM", "5:58 AM", "5:59 AM", "6:00 AM", "6:01 AM", "6:02 AM", "6:03 AM", "6:04 AM", "6:05 AM", "6:06 AM", "6:07 AM", "6:08 AM", "6:09 AM", "6:10 AM", "6:11 AM", "6:12 AM", "6:13 AM", "6:14 AM", "6:15 AM", "6:16 AM", "6:17 AM", "6:18 AM", "6:19 AM", "6:20 AM", "6:21 AM", "6:22 AM", "6:23 AM", "6:24 AM", "6:25 AM", "6:26 AM", "6:27 AM", "6:28 AM", "6:29 AM", "6:30 AM", "6:31 AM", "6:32 AM", "6:33 AM", "6:34 AM", "6:35 AM", "6:36 AM", "6:37 AM", "6:38 AM", "6:39 AM", "6:40 AM", "6:41 AM", "6:42 AM", "6:43 AM", "6:44 AM", "6:45 AM", "6:46 AM", "6:47 AM", "6:48 AM", "6:49 AM", "6:50 AM", "6:51 AM", "6:52 AM", "6:53 AM", "6:54 AM", "6:55 AM", "6:56 AM", "6:57 AM", "6:58 AM", "6:59 AM", "7:00 AM", "7:01 AM", "7:02 AM", "7:03 AM", "7:04 AM", "7:05 AM", "7:06 AM", "7:07 AM", "7:08 AM", "7:09 AM", "7:10 AM", "7:11 AM", "7:12 AM", "7:13 AM", "7:14 AM", "7:15 AM", "7:16 AM", "7:17 AM", "7:18 AM", "7:19 AM", "7:20 AM", "7:21 AM", "7:22 AM", "7:23 AM", "7:24 AM", "7:25 AM", "7:26 AM", "7:27 AM", "7:28 AM", "7:29 AM", "7:30 AM", "7:31 AM", "7:32 AM", "7:33 AM", "7:34 AM", "7:35 AM", "7:36 AM", "7:37 AM", "7:38 AM", "7:39 AM", "7:40 AM", "7:41 AM", "7:42 AM", "7:43 AM", "7:44 AM", "7:45 AM", "7:46 AM", "7:47 AM", "7:48 AM", "7:49 AM", "7:50 AM", "7:51 AM", "7:52 AM", "7:53 AM", "7:54 AM", "7:55 AM", "7:56 AM", "7:57 AM", "7:58 AM", "7:59 AM", "8:00 AM", "8:01 AM", "8:02 AM", "8:03 AM", "8:04 AM", "8:05 AM", "8:06 AM", "8:07 AM", "8:08 AM", "8:09 AM", "8:10 AM", "8:11 AM", "8:12 AM", "8:13 AM", "8:14 AM", "8:15 AM", "8:16 AM", "8:17 AM", "8:18 AM", "8:19 AM", "8:20 AM", "8:21 AM", "8:22 AM", "8:23 AM", "8:24 AM", "8:25 AM", "8:26 AM", "8:27 AM", "8:28 AM", "8:29 AM", "8:30 AM", "8:31 AM", "8:32 AM", "8:33 AM", "8:34 AM", "8:35 AM", "8:36 AM", "8:37 AM", "8:38 AM", "8:39 AM", "8:40 AM", "8:41 AM", "8:42 AM", "8:43 AM", "8:44 AM", "8:45 AM", "8:46 AM", "8:47 AM", "8:48 AM", "8:49 AM", "8:50 AM", "8:51 AM", "8:52 AM", "8:53 AM", "8:54 AM", "8:55 AM", "8:56 AM", "8:57 AM", "8:58 AM", "8:59 AM", "9:00 AM", "9:01 AM", "9:02 AM", "9:03 AM", "9:04 AM", "9:05 AM", "9:06 AM", "9:07 AM", "9:08 AM", "9:09 AM", "9:10 AM", "9:11 AM", "9:12 AM", "9:13 AM", "9:14 AM", "9:15 AM", "9:16 AM", "9:17 AM", "9:18 AM", "9:19 AM", "9:20 AM", "9:21 AM", "9:22 AM", "9:23 AM", "9:24 AM", "9:25 AM", "9:26 AM", "9:27 AM", "9:28 AM", "9:29 AM", "9:30 AM", "9:31 AM", "9:32 AM", "9:33 AM", "9:34 AM", "9:35 AM", "9:36 AM", "9:37 AM", "9:38 AM", "9:39 AM", "9:40 AM", "9:41 AM", "9:42 AM", "9:43 AM", "9:44 AM", "9:45 AM", "9:46 AM", "9:47 AM", "9:48 AM", "9:49 AM", "9:50 AM", "9:51 AM", "9:52 AM", "9:53 AM", "9:54 AM", "9:55 AM", "9:56 AM", "9:57 AM", "9:58 AM", "9:59 AM", "10:00 AM", "10:01 AM", "10:02 AM", "10:03 AM", "10:04 AM", "10:05 AM", "10:06 AM", "10:07 AM", "10:08 AM", "10:09 AM", "10:10 AM", "10:11 AM", "10:12 AM", "10:13 AM", "10:14 AM", "10:15 AM", "10:16 AM", "10:17 AM", "10:18 AM", "10:19 AM", "10:20 AM", "10:21 AM", "10:22 AM", "10:23 AM", "10:24 AM", "10:25 AM", "10:26 AM", "10:27 AM", "10:28 AM", "10:29 AM", "10:30 AM", "10:31 AM", "10:32 AM", "10:33 AM", "10:34 AM", "10:35 AM", "10:36 AM", "10:37 AM", "10:38 AM", "10:39 AM", "10:40 AM", "10:41 AM", "10:42 AM", "10:43 AM", "10:44 AM", "10:45 AM", "10:46 AM", "10:47 AM", "10:48 AM", "10:49 AM", "10:50 AM", "10:51 AM", "10:52 AM", "10:53 AM", "10:54 AM", "10:55 AM", "10:56 AM", "10:57 AM", "10:58 AM", "10:59 AM", "11:00 AM", "11:01 AM", "11:02 AM", "11:03 AM", "11:04 AM", "11:05 AM", "11:06 AM", "11:07 AM", "11:08 AM", "11:09 AM", "11:10 AM", "11:11 AM", "11:12 AM", "11:13 AM", "11:14 AM", "11:15 AM", "11:16 AM", "11:17 AM", "11:18 AM", "11:19 AM", "11:20 AM", "11:21 AM", "11:22 AM", "11:23 AM", "11:24 AM", "11:25 AM", "11:26 AM", "11:27 AM", "11:28 AM", "11:29 AM", "11:30 AM", "11:31 AM", "11:32 AM", "11:33 AM", "11:34 AM", "11:35 AM", "11:36 AM", "11:37 AM", "11:38 AM", "11:39 AM", "11:40 AM", "11:41 AM", "11:42 AM", "11:43 AM", "11:44 AM", "11:45 AM", "11:46 AM", "11:47 AM", "11:48 AM", "11:49 AM", "11:50 AM", "11:51 AM", "11:52 AM", "11:53 AM", "11:54 AM", "11:55 AM", "11:56 AM", "11:57 AM", "11:58 AM", "11:59 AM", "12:00 PM", "12:01 PM", "12:02 PM", "12:03 PM", "12:04 PM", "12:05 PM", "12:06 PM", "12:07 PM", "12:08 PM", "12:09 PM", "12:10 PM", "12:11 PM", "12:12 PM", "12:13 PM", "12:14 PM", "12:15 PM", "12:16 PM", "12:17 PM", "12:18 PM", "12:19 PM", "12:20 PM", "12:21 PM", "12:22 PM", "12:23 PM", "12:24 PM", "12:25 PM", "12:26 PM", "12:27 PM", "12:28 PM", "12:29 PM", "12:30 PM", "12:31 PM", "12:32 PM", "12:33 PM", "12:34 PM", "12:35 PM", "12:36 PM", "12:37 PM", "12:38 PM", "12:39 PM", "12:40 PM", "12:41 PM", "12:42 PM", "12:43 PM", "12:44 PM", "12:45 PM", "12:46 PM", "12:47 PM", "12:48 PM", "12:49 PM", "12:50 PM", "12:51 PM", "12:52 PM", "12:53 PM", "12:54 PM", "12:55 PM", "12:56 PM", "12:57 PM", "12:58 PM", "12:59 PM", "1:00 PM", "1:01 PM", "1:02 PM", "1:03 PM", "1:04 PM", "1:05 PM", "1:06 PM", "1:07 PM", "1:08 PM", "1:09 PM", "1:10 PM", "1:11 PM", "1:12 PM", "1:13 PM", "1:14 PM", "1:15 PM", "1:16 PM", "1:17 PM", "1:18 PM", "1:19 PM", "1:20 PM", "1:21 PM", "1:22 PM", "1:23 PM", "1:24 PM", "1:25 PM", "1:26 PM", "1:27 PM", "1:28 PM", "1:29 PM", "1:30 PM", "1:31 PM", "1:32 PM", "1:33 PM", "1:34 PM", "1:35 PM", "1:36 PM", "1:37 PM", "1:38 PM", "1:39 PM", "1:40 PM", "1:41 PM", "1:42 PM", "1:43 PM", "1:44 PM", "1:45 PM", "1:46 PM", "1:47 PM", "1:48 PM", "1:49 PM", "1:50 PM", "1:51 PM", "1:52 PM", "1:53 PM", "1:54 PM", "1:55 PM", "1:56 PM", "1:57 PM", "1:58 PM", "1:59 PM", "2:00 PM", "2:01 PM", "2:02 PM", "2:03 PM", "2:04 PM", "2:05 PM", "2:06 PM", "2:07 PM", "2:08 PM", "2:09 PM", "2:10 PM", "2:11 PM", "2:12 PM", "2:13 PM", "2:14 PM", "2:15 PM", "2:16 PM", "2:17 PM", "2:18 PM", "2:19 PM", "2:20 PM", "2:21 PM", "2:22 PM", "2:23 PM", "2:24 PM", "2:25 PM", "2:26 PM", "2:27 PM", "2:28 PM", "2:29 PM", "2:30 PM", "2:31 PM", "2:32 PM", "2:33 PM", "2:34 PM", "2:35 PM", "2:36 PM", "2:37 PM", "2:38 PM", "2:39 PM", "2:40 PM", "2:41 PM", "2:42 PM", "2:43 PM", "2:44 PM", "2:45 PM", "2:46 PM", "2:47 PM", "2:48 PM", "2:49 PM", "2:50 PM", "2:51 PM", "2:52 PM", "2:53 PM", "2:54 PM", "2:55 PM", "2:56 PM", "2:57 PM", "2:58 PM", "2:59 PM", "3:00 PM", "3:01 PM", "3:02 PM", "3:03 PM", "3:04 PM", "3:05 PM", "3:06 PM", "3:07 PM", "3:08 PM", "3:09 PM", "3:10 PM", "3:11 PM", "3:12 PM", "3:13 PM", "3:14 PM", "3:15 PM", "3:16 PM", "3:17 PM", "3:18 PM", "3:19 PM", "3:20 PM", "3:21 PM", "3:22 PM", "3:23 PM", "3:24 PM", "3:25 PM", "3:26 PM", "3:27 PM", "3:28 PM", "3:29 PM", "3:30 PM", "3:31 PM", "3:32 PM", "3:33 PM", "3:34 PM", "3:35 PM", "3:36 PM", "3:37 PM", "3:38 PM", "3:39 PM", "3:40 PM", "3:41 PM", "3:42 PM", "3:43 PM", "3:44 PM", "3:45 PM", "3:46 PM", "3:47 PM", "3:48 PM", "3:49 PM", "3:50 PM", "3:51 PM", "3:52 PM", "3:53 PM", "3:54 PM", "3:55 PM", "3:56 PM", "3:57 PM", "3:58 PM", "3:59 PM", "4:00 PM", "4:01 PM", "4:02 PM", "4:03 PM", "4:04 PM", "4:05 PM", "4:06 PM", "4:07 PM", "4:08 PM", "4:09 PM", "4:10 PM", "4:11 PM", "4:12 PM", "4:13 PM", "4:14 PM", "4:15 PM", "4:16 PM", "4:17 PM", "4:18 PM", "4:19 PM", "4:20 PM", "4:21 PM", "4:22 PM", "4:23 PM", "4:24 PM", "4:25 PM", "4:26 PM", "4:27 PM", "4:28 PM", "4:29 PM", "4:30 PM", "4:31 PM", "4:32 PM", "4:33 PM", "4:34 PM", "4:35 PM", "4:36 PM", "4:37 PM", "4:38 PM", "4:39 PM", "4:40 PM", "4:41 PM", "4:42 PM", "4:43 PM", "4:44 PM", "4:45 PM", "4:46 PM", "4:47 PM", "4:48 PM", "4:49 PM", "4:50 PM", "4:51 PM", "4:52 PM", "4:53 PM", "4:54 PM", "4:55 PM", "4:56 PM", "4:57 PM", "4:58 PM", "4:59 PM", "5:00 PM", "5:01 PM", "5:02 PM", "5:03 PM", "5:04 PM", "5:05 PM", "5:06 PM", "5:07 PM", "5:08 PM", "5:09 PM", "5:10 PM", "5:11 PM", "5:12 PM", "5:13 PM", "5:14 PM", "5:15 PM", "5:16 PM", "5:17 PM", "5:18 PM", "5:19 PM", "5:20 PM", "5:21 PM", "5:22 PM", "5:23 PM", "5:24 PM", "5:25 PM", "5:26 PM", "5:27 PM", "5:28 PM", "5:29 PM", "5:30 PM", "5:31 PM", "5:32 PM", "5:33 PM", "5:34 PM", "5:35 PM", "5:36 PM", "5:37 PM", "5:38 PM", "5:39 PM", "5:40 PM", "5:41 PM", "5:42 PM", "5:43 PM", "5:44 PM", "5:45 PM", "5:46 PM", "5:47 PM", "5:48 PM", "5:49 PM", "5:50 PM", "5:51 PM", "5:52 PM", "5:53 PM", "5:54 PM", "5:55 PM", "5:56 PM", "5:57 PM", "5:58 PM", "5:59 PM", "6:00 PM", "6:01 PM", "6:02 PM", "6:03 PM", "6:04 PM", "6:05 PM", "6:06 PM", "6:07 PM", "6:08 PM", "6:09 PM", "6:10 PM", "6:11 PM", "6:12 PM", "6:13 PM", "6:14 PM", "6:15 PM", "6:16 PM", "6:17 PM", "6:18 PM", "6:19 PM", "6:20 PM", "6:21 PM", "6:22 PM", "6:23 PM", "6:24 PM", "6:25 PM", "6:26 PM", "6:27 PM", "6:28 PM", "6:29 PM", "6:30 PM", "6:31 PM", "6:32 PM", "6:33 PM", "6:34 PM", "6:35 PM", "6:36 PM", "6:37 PM", "6:38 PM", "6:39 PM", "6:40 PM", "6:41 PM", "6:42 PM", "6:43 PM", "6:44 PM", "6:45 PM", "6:46 PM", "6:47 PM", "6:48 PM", "6:49 PM", "6:50 PM", "6:51 PM", "6:52 PM", "6:53 PM", "6:54 PM", "6:55 PM", "6:56 PM", "6:57 PM", "6:58 PM", "6:59 PM", "7:00 PM", "7:01 PM", "7:02 PM", "7:03 PM", "7:04 PM", "7:05 PM", "7:06 PM", "7:07 PM", "7:08 PM", "7:09 PM", "7:10 PM", "7:11 PM", "7:12 PM", "7:13 PM", "7:14 PM", "7:15 PM", "7:16 PM", "7:17 PM", "7:18 PM", "7:19 PM", "7:20 PM", "7:21 PM", "7:22 PM", "7:23 PM", "7:24 PM", "7:25 PM", "7:26 PM", "7:27 PM", "7:28 PM", "7:29 PM", "7:30 PM", "7:31 PM", "7:32 PM", "7:33 PM", "7:34 PM", "7:35 PM", "7:36 PM", "7:37 PM", "7:38 PM", "7:39 PM", "7:40 PM", "7:41 PM", "7:42 PM", "7:43 PM", "7:44 PM", "7:45 PM", "7:46 PM", "7:47 PM", "7:48 PM", "7:49 PM", "7:50 PM", "7:51 PM", "7:52 PM", "7:53 PM", "7:54 PM", "7:55 PM", "7:56 PM", "7:57 PM", "7:58 PM", "7:59 PM", "8:00 PM", "8:01 PM", "8:02 PM", "8:03 PM", "8:04 PM", "8:05 PM", "8:06 PM", "8:07 PM", "8:08 PM", "8:09 PM", "8:10 PM", "8:11 PM", "8:12 PM", "8:13 PM", "8:14 PM", "8:15 PM", "8:16 PM", "8:17 PM", "8:18 PM", "8:19 PM", "8:20 PM", "8:21 PM", "8:22 PM", "8:23 PM", "8:24 PM", "8:25 PM", "8:26 PM", "8:27 PM", "8:28 PM", "8:29 PM", "8:30 PM", "8:31 PM", "8:32 PM", "8:33 PM", "8:34 PM", "8:35 PM", "8:36 PM", "8:37 PM", "8:38 PM", "8:39 PM", "8:40 PM", "8:41 PM", "8:42 PM", "8:43 PM", "8:44 PM", "8:45 PM", "8:46 PM", "8:47 PM", "8:48 PM", "8:49 PM", "8:50 PM", "8:51 PM", "8:52 PM", "8:53 PM", "8:54 PM", "8:55 PM", "8:56 PM", "8:57 PM", "8:58 PM", "8:59 PM", "9:00 PM", "9:01 PM", "9:02 PM", "9:03 PM", "9:04 PM", "9:05 PM", "9:06 PM", "9:07 PM", "9:08 PM", "9:09 PM", "9:10 PM", "9:11 PM", "9:12 PM", "9:13 PM", "9:14 PM", "9:15 PM", "9:16 PM", "9:17 PM", "9:18 PM", "9:19 PM", "9:20 PM", "9:21 PM", "9:22 PM", "9:23 PM", "9:24 PM", "9:25 PM", "9:26 PM", "9:27 PM", "9:28 PM", "9:29 PM", "9:30 PM", "9:31 PM", "9:32 PM", "9:33 PM", "9:34 PM", "9:35 PM", "9:36 PM", "9:37 PM", "9:38 PM", "9:39 PM", "9:40 PM", "9:41 PM", "9:42 PM", "9:43 PM", "9:44 PM", "9:45 PM", "9:46 PM", "9:47 PM", "9:48 PM", "9:49 PM", "9:50 PM", "9:51 PM", "9:52 PM", "9:53 PM", "9:54 PM", "9:55 PM", "9:56 PM", "9:57 PM", "9:58 PM", "9:59 PM", "10:00 PM", "10:01 PM", "10:02 PM", "10:03 PM", "10:04 PM", "10:05 PM", "10:06 PM", "10:07 PM", "10:08 PM", "10:09 PM", "10:10 PM", "10:11 PM", "10:12 PM", "10:13 PM", "10:14 PM", "10:15 PM", "10:16 PM", "10:17 PM", "10:18 PM", "10:19 PM", "10:20 PM", "10:21 PM", "10:22 PM", "10:23 PM", "10:24 PM", "10:25 PM", "10:26 PM", "10:27 PM", "10:28 PM", "10:29 PM", "10:30 PM", "10:31 PM", "10:32 PM", "10:33 PM", "10:34 PM", "10:35 PM", "10:36 PM", "10:37 PM", "10:38 PM", "10:39 PM", "10:40 PM", "10:41 PM", "10:42 PM", "10:43 PM", "10:44 PM", "10:45 PM", "10:46 PM", "10:47 PM", "10:48 PM", "10:49 PM", "10:50 PM", "10:51 PM", "10:52 PM", "10:53 PM", "10:54 PM", "10:55 PM", "10:56 PM", "10:57 PM", "10:58 PM", "10:59 PM", "11:00 PM", "11:01 PM", "11:02 PM", "11:03 PM", "11:04 PM", "11:05 PM", "11:06 PM", "11:07 PM", "11:08 PM", "11:09 PM", "11:10 PM", "11:11 PM", "11:12 PM", "11:13 PM", "11:14 PM", "11:15 PM", "11:16 PM", "11:17 PM", "11:18 PM", "11:19 PM", "11:20 PM", "11:21 PM", "11:22 PM", "11:23 PM", "11:24 PM", "11:25 PM", "11:26 PM", "11:27 PM", "11:28 PM", "11:29 PM", "11:30 PM", "11:31 PM", "11:32 PM", "11:33 PM", "11:34 PM", "11:35 PM", "11:36 PM", "11:37 PM", "11:38 PM", "11:39 PM", "11:40 PM", "11:41 PM", "11:42 PM", "11:43 PM", "11:44 PM", "11:45 PM", "11:46 PM", "11:47 PM", "11:48 PM", "11:49 PM", "11:50 PM", "11:51 PM", "11:52 PM", "11:53 PM", "11:54 PM", "11:55 PM", "11:56 PM", "11:57 PM", "11:58 PM", "11:59 PM" }));
        timeComboBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        timeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeComboBoxActionPerformed(evt);
            }
        });

        timeTextLabel.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 14)); // NOI18N
        timeTextLabel.setForeground(new java.awt.Color(204, 204, 204));
        timeTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        timeTextLabel.setText("Time");

        dateTextLabel.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 14)); // NOI18N
        dateTextLabel.setForeground(new java.awt.Color(204, 204, 204));
        dateTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dateTextLabel.setText("Date");

        headerTextLabel.setFont(new java.awt.Font("Inter 28pt", 1, 31)); // NOI18N
        headerTextLabel.setText("Hi, where would you like to go?☀");

        searchFlightButton.setBackground(new java.awt.Color(112, 188, 255));
        searchFlightButton.setFont(new java.awt.Font("Inter 24pt Light", 1, 12)); // NOI18N
        searchFlightButton.setForeground(new java.awt.Color(255, 255, 255));
        searchFlightButton.setText("Search Flight");
        searchFlightButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(112, 188, 255), 1, true));
        searchFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFlightButtonActionPerformed(evt);
            }
        });

        flightListTable.setFont(new java.awt.Font("Inter 24pt Light", 0, 12)); // NOI18N
        flightListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Airline", "Flight", "From", "To", "Departure", "Arrival", "Price", "Seats"
            }
        ));
        jScrollPane1.setViewportView(flightListTable);

        continueBtn.setBackground(new java.awt.Color(112, 188, 255));
        continueBtn.setFont(new java.awt.Font("Inter 24pt Light", 1, 12)); // NOI18N
        continueBtn.setForeground(new java.awt.Color(255, 255, 255));
        continueBtn.setText("Continue");
        continueBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(112, 188, 255), 1, true));
        continueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueBtnActionPerformed(evt);
            }
        });

        dateChooser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgPanelLayout.createSequentialGroup()
                                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fromTextLabel)
                                    .addComponent(placeFromComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(toTextLabel)
                                    .addComponent(placeToComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgPanelLayout.createSequentialGroup()
                                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(headerTextLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(flightLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgPanelLayout.createSequentialGroup()
                                        .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dateTextLabel)
                                            .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(69, 69, 69)
                                        .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(timeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(timeTextLabel)
                                            .addComponent(searchFlightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(continueBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(128, 128, 128))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(availableTextLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerTextLabel)
                .addGap(30, 30, 30)
                .addComponent(flightLabel)
                .addGap(18, 18, 18)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addComponent(fromTextLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(placeFromComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addComponent(toTextLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(placeToComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateTextLabel)
                            .addComponent(timeTextLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(timeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(searchFlightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(availableTextLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(continueBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void placeFromComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeFromComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placeFromComboBoxActionPerformed

    private void placeToComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeToComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placeToComboBoxActionPerformed

    private void timeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeComboBoxActionPerformed

    private void searchFlightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFlightButtonActionPerformed
        String from = String.valueOf(placeFromComboBox.getSelectedItem()).trim();
        String to = String.valueOf(placeToComboBox.getSelectedItem()).trim();
        String time = String.valueOf(timeComboBox.getSelectedItem()).trim();

        DefaultTableModel model = (DefaultTableModel) flightListTable.getModel();
        model.setRowCount(0); // Clear previous results

     
        boolean flightFound = false;

        for (Flight flight : flights) {
            if (flight.getFrom().trim().equalsIgnoreCase(from) &&
                flight.getTo().trim().equalsIgnoreCase(to) &&
                flight.getDepartureTime().trim().equalsIgnoreCase(time)) {

                model.addRow(new Object[]{
                    flight.getAirline(), flight.getFlightNumber(),
                    flight.getFrom(), flight.getTo(),
                    flight.getDepartureTime(), flight.getArrivalTime(),
                    flight.getPrice(),
                    seatAvailabilityMap.get(flight.getFlightNumber()) + " seats"
                });

                flightFound = true;
            }
    }

        if (!flightFound) {
            model.addRow(new Object[]{"No available flights", "", "", "", "", ""});
        }

        flightListTable.repaint();
        flightListTable.revalidate();
    }//GEN-LAST:event_searchFlightButtonActionPerformed

    private void continueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueBtnActionPerformed
         int selectedRow = flightListTable.getSelectedRow();
         if (selectedRow != -1 && flightListTable.getValueAt(selectedRow, 0) != null) {
             String airline   = flightListTable.getValueAt(selectedRow, 0).toString();
             String flightNum = flightListTable.getValueAt(selectedRow, 1).toString();
             String from      = flightListTable.getValueAt(selectedRow, 2).toString();
             String to        = flightListTable.getValueAt(selectedRow, 3).toString();
             String departure = flightListTable.getValueAt(selectedRow, 4).toString();
             String arrival   = flightListTable.getValueAt(selectedRow, 5).toString();
             String price     = flightListTable.getValueAt(selectedRow, 6).toString();

             // build your Flight object
             Flight selectedFlight = new Flight(
                 airline, flightNum, from, to, departure, arrival, price
             );

             // open the reservation window
             SeatReservation seatFrame = new SeatReservation(selectedFlight);
             seatFrame.setVisible(true);

             // close the search screen
             this.dispose();
         } else {
             JOptionPane.showMessageDialog(
                 this,
                 "Please select a flight from the list."
             );
         }
    
    }//GEN-LAST:event_continueBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchFlight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availableTextLabel;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton continueBtn;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel dateTextLabel;
    private javax.swing.JLabel flightLabel;
    private javax.swing.JTable flightListTable;
    private javax.swing.JLabel fromTextLabel;
    private javax.swing.JLabel headerTextLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> placeFromComboBox;
    private javax.swing.JComboBox<String> placeToComboBox;
    private javax.swing.JButton searchFlightButton;
    private javax.swing.JComboBox<String> timeComboBox;
    private javax.swing.JLabel timeTextLabel;
    private javax.swing.JLabel toTextLabel;
    // End of variables declaration//GEN-END:variables
}
